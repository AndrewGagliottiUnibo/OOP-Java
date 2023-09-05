package oop.lab02.math;

//javac -d 02-classpathcompilation/bin 01-packages/src/oop/lab02/math/ComplexNum.java -- compilazione 
//da altra directory
//nell'esercizio proposto è incorretto utilizzare questa forma

//javac -d bin -cp ../01-packages/bin/ ./src/oop/lab02/math/UseComplex.java
//compila un file basandoti su una libreria di un altra directory
//nell'esercizio bisognava usare questa forma

//java -cp ./bin/\;../01-packages/bin/ oop.lab02.math.UseComplex
//run code using .class file from other directory in order to run the one from the desired directory
// \; si usa perchè ci sono problemi di compatibilità tra Windows e Unix, non interpreta
//runno il codice basandomi su un .class di un'altra directory e runnandolo assieme al nuovo .class
//bene il carattere.
public class UseComplex {

    public static void main(final String[] args) {
        final ComplexNum c1 = new ComplexNum();
        c1.build(1, -45);
        final ComplexNum c2 = new ComplexNum();
        c2.build(2, 8);

        System.out.println(c1.toStringRep());
        System.out.println(c2.toStringRep());

        c1.add(c2);
        System.out.println("c1 new value is: " + c1.toStringRep() + "\n");
    }
}
