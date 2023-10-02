package it.unibo.arrays;

class MyCircularArray {

    private int[] array;
    private int index = 0;
    
    MyCircularArray(int size) {
        this.array = new int[size];
    }

    MyCircularArray() {
        this(0);
    }

    void add(final int elem) {
        if(this.index == this.array.length) {
            this.index = 0;
        }

        this.array[this.index] = elem;
        this.index++;
    }

    void reset() {
        int length = this.array.length;
        this.array = new int[length];
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]\n");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi
        MyCircularArray array = new MyCircularArray(10);

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }
        array.printArray();

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        for (int i = 11; i <= 15; i++) {
            array.add(i);
        }
        array.printArray();

        // 4) Invocare il metodo reset
        array.reset();

        // 5) Stampare il contenuto dell'array circolare
        array.printArray();

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        for (int i = 23; i <= 38; i++) {
            array.add(i);
        }
        array.printArray();
    }
}
