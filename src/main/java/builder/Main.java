package builder;

import builder.builder.HaltingBuilder;
import builder.builder.NHaltingBuilder;
import builder.haltchecker.HaltChecker;
import builder.model.Program;
import builder.reverse.Reverse;

public class Main {
    public static void main(String[] args) {
        Program p1 = new HaltingBuilder().build();
        Program p2 = new NHaltingBuilder().build();

        HaltChecker haltChecker = new HaltChecker();

        System.out.println("Programa 1 (Se detiene):");
        System.out.println("Halting p1: " + haltChecker.halt(p1));

        System.out.println("\nPrograma 2 (No se detiene):");
        System.out.println("Halting p2: " + haltChecker.halt(p2));

        System.out.println();
        System.out.println("Probando Reverser con p1 (Programa que se detiene):");
        Program reverse1 = new Reverse(p1);
        reverse1.run();  //Entra en bucle infinito si se detiene

        System.out.println();
        System.out.println("Probando Reverser con p2 (Programa que no se detiene):");
        Program reverse2 = new Reverse(p2);
        reverse2.run();
    }
}
