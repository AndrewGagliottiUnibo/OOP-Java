package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    public static final double TRANSPORT_CONSUMPTION = 0.1;

    private final BasicArm leftArm;
    private final BasicArm rightArm;

    // Constructor
    public RobotWithTwoArms(final String robotName) {
        super(robotName);
        this.leftArm = new BasicArm("Left arm");
        this.rightArm = new BasicArm("Right arm");
    }

    @Override
    protected double getBatteryRequirementForMovement() {
        return super.getBatteryRequirementForMovement() + this.getCarriedItemsCount() * TRANSPORT_CONSUMPTION;
    }

    // Actions performed
    @Override
    public boolean pickUp() {
        if (this.rightArm.isGrabbed()) {
            if (this.leftArm.isGrabbed()) {
                return false;
            }

            this.pickItem(this.leftArm);
        } else {
            this.pickItem(this.rightArm);
        }

        return true;
    }

    @Override
    public boolean dropDown() {
        if (this.leftArm.isGrabbed()) {
            this.leaveItem(this.leftArm);
            return true;
        }

        if (this.rightArm.isGrabbed()) {
            this.leaveItem(this.rightArm);
            return true;
        }

        return false;
    }

    @Override
    public int getCarriedItemsCount() {
        return (this.leftArm.isGrabbed() ? 1 : 0) + (this.rightArm.isGrabbed() ? 1 : 0);
    }

    private void pickItem(final BasicArm arm) {
        if (this.isBatteryEnough(arm.getConsuptionForPickUp()) && !arm.isGrabbed()) {
            this.log(arm.toString() + " is picking an object");
            arm.pickUp();
            this.consumeBattery(arm.getConsuptionForPickUp());
        } else {
            this.log("Battery Error: " + this.getBatteryLevel() + "," + arm.toString() + " Grabbing? " + arm.isGrabbed());
        }
    }

    private void leaveItem(final BasicArm arm) {
        if (this.isBatteryEnough(arm.getConsuptionForDropDown()) && arm.isGrabbed()) {
            this.log(arm.toString() + " is leaving an object");
            arm.dropDown();
            this.consumeBattery(arm.getConsuptionForDropDown());
        } else {
            log("Battery Error: " + this.getBatteryLevel() + "," + arm.toString() + " Grabbing? "
                    + arm.isGrabbed());
        }
    }
}
