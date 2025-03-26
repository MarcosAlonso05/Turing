package abstractFactory;

import abstractFactory.factories.HaltingFactory;
import abstractFactory.factories.NHaltingFactory;
import abstractFactory.factories.ProgramFactory;
import abstractFactory.haltchecker.HaltChecker;
import abstractFactory.model.Program;


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
    }
}
