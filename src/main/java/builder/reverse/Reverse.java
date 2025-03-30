package builder.reverse;

import builder.haltchecker.HaltChecker;
import builder.model.Program;

public class Reverse implements Program {
    private final Program program;

    public Reverse(Program program) {
        this.program = program;
    }

    @Override
    public void run() {
        HaltChecker haltChecker = new HaltChecker();
        if (haltChecker.halt(program)) {
            System.out.println("Reverser: El programa se detendría, así que entro en un bucle infinito");
            while(true) {
                System.out.println("Bucle infinito...");
                break;
            }
        } else {
            System.out.println("Reverser: El programa no se detendría, por lo que termino inmediatamente.");
        }
    }
}