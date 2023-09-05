class UseTrain {
    public static void main(String[] args) {
        class Treno{

            int nTotSeats;
            int nFirstClassSeats;
            int nSecondClassSeats;
            int nFirstClassReservedSeats;
            int nSecondClassReservedSeats;

            void build(int Seats, int fSeats, int sSeats) {
                this.nTotSeats = Seats;
                this.nFirstClassSeats = fSeats;
                this.nSecondClassSeats = sSeats;
                this.nFirstClassReservedSeats = 0;
                this.nSecondClassReservedSeats = 0;
            }

            void reserveFirstClassSeats(int num) {
                this.nFirstClassReservedSeats = this.nFirstClassReservedSeats + num;
            }

            void reserveSecondClassSeats(int num) {
                this.nSecondClassReservedSeats = this.nSecondClassReservedSeats + num;
            }

            //ricorda la conversione da int a double nelle operazioni
            double getTotOccupancyRatio() {
                return (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) * 100.0 / nTotSeats;
            }

            double getFirstClassOccupancyRatio() {
                return this.nFirstClassReservedSeats * 100d / this.nFirstClassSeats;
            }

            double getSecondClassOccupancyRatio() {
                return this.nSecondClassReservedSeats * 100d / this.nSecondClassSeats;
            }

            void deleteAllReservations() {
                this.build(0, 0, 0);
            }

        }

        Treno Reg6264 = new Treno();
        Treno Reg69007 = new Treno();

        //ricorda che le chiamate ai metodi hanno le parentesi tonde alla fine ()
        Reg6264.build(240, 60, 180);
        System.out.println("Posti disponibili nel Regionale 6264: " + Reg6264.nTotSeats + " totali\n " + Reg6264.nFirstClassSeats + " in prima classe\n " + Reg6264.nSecondClassSeats + " in seconda classe");
        Reg6264.reserveFirstClassSeats(45);
        Reg6264.reserveSecondClassSeats(135);
        System.out.println("\nPosti prenotati:\n" + Reg6264.nFirstClassReservedSeats + " in prima classe\n" + Reg6264.nSecondClassReservedSeats + " in seconda classe\n");
        System.out.println("Posti rimasti: " + (Reg6264.nTotSeats - Reg6264.nFirstClassReservedSeats - Reg6264.nSecondClassReservedSeats));
        System.out.println("Prima classe percentuale occupazione: " + Reg6264.getFirstClassOccupancyRatio());
        System.out.println("Seconda classe percentuale occupazione: " + Reg6264.getSecondClassOccupancyRatio());
        System.out.println("Percentuale posti totali occupati: " + Reg6264.getTotOccupancyRatio());
        System.out.println("Ci spiace, a causa di un incidente sulla linea e' stato sopresso il Regionale veloce 6462\n\n");
        Reg6264.deleteAllReservations();

        Reg69007.build(1000, 300, 700);
        System.out.println("Nuovo treno disponibile: Regionale 69007\n");
        System.out.println("Posti disponibili nel Regionale 69007: " + Reg69007.nTotSeats + " totali\n " + Reg69007.nFirstClassSeats + " in prima classe\n " + Reg69007.nSecondClassSeats + " in seconda classe\n");
        Reg69007.reserveFirstClassSeats(300);
        Reg69007.reserveSecondClassSeats(350);
        System.out.println("Prima classe percentuale occupazione: " + Reg69007.getFirstClassOccupancyRatio());
        System.out.println("Seconda classe percentuale occupazione: " + Reg69007.getSecondClassOccupancyRatio());
        System.out.println("Percentuale posti totali occupati: " + Reg69007.getTotOccupancyRatio());
    }
}