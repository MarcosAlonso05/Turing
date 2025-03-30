package abstractFactory;

import abstractFactory.factories.HaltingFactory;
import abstractFactory.factories.NHaltingFactory;
import abstractFactory.factories.ProgramFactory;
import abstractFactory.haltchecker.HaltChecker;
import abstractFactory.model.Program;
import abstractFactory.reverse.Reverse;


public class Main {
    public static void main(String[] args) {
        ProgramFactory factoryHalting = new HaltingFactory();
        ProgramFactory factoryNoHalting = new NHaltingFactory();

        Program p1 = factoryHalting.create();
        Program p2 = factoryNoHalting.create();

        HaltChecker haltChecker = new HaltChecker();

        System.out.println("Programa 1 (Se detiene):");
        System.out.println();

        System.out.println("Halting p1: " + haltChecker.halt(p1));

        System.out.println();
        System.out.println("Programa 2 (No se detiene):");
        System.out.println();

        System.out.println("Halting p2: " + haltChecker.halt(p2));

        System.out.println();
        System.out.println("Probando Reverser con p1 (Programa que se detiene):");
        Program reverse1 = new Reverse(p1, haltChecker);
        reverse1.run();  //Entra en bucle infinito si se detiene

        System.out.println();
        System.out.println("Probando Reverser con p2 (Programa que no se detiene):");
        Program reverse2 = new Reverse(p2, haltChecker);
        reverse2.run();
    }
}
