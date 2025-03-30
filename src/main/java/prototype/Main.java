package prototype;

import prototype.haltproblem.Program;
import prototype.programs.CountDown;
import prototype.programs.CountUp;
import prototype.reverser.Reverser;
import prototype.haltchecker.HaltChecker;

public class Main {
    public static void main(String[] args) {
        // Creamos instancias prototipo de los programas
        CountDown countDownPrototype = new CountDown(5);
        CountUp countUpPrototype = new CountUp(1);
        Reverser reverserPrototype = new Reverser();

        // Clonamos los prototipos para crear nuevas instancias
        Program p1 = countDownPrototype.clone();
        Program p2 = countUpPrototype.clone();

        HaltChecker haltChecker = new HaltChecker();

        System.out.println("Programa 1 (CountDown - Se detiene):");
        System.out.println("Halting p1: " + haltChecker.checkHalt(p1));
        p1.run();

        System.out.println("\nPrograma 2 (CountUp - No se detiene):");
        System.out.println("Halting p2: " + haltChecker.checkHalt(p2));
        // p2.run(); // Descomentar para ver el bucle infinito (no se detendrá)

        System.out.println("\nProbando Reverser con p1 (Programa que se detiene):");
        Program reverse1 = reverserPrototype.clone();
        reverse1.setInput(p1);
        reverse1.run();  // Entra en bucle infinito si el original se detiene

        System.out.println("\nProbando Reverser con p2 (Programa que no se detiene):");
        Program reverse2 = reverserPrototype.clone();
        reverse2.setInput(p2);
        reverse2.run();  // Se detiene si el original no se detiene
    }
}