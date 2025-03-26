package abstractFactory.reverse;

import abstractFactory.haltchecker.HaltChecker;
import abstractFactory.model.Program;

public class Reverse implements Program {

    private Program program;
    private HaltChecker haltChecker;

    public Reverse(Program program, HaltChecker haltChecker) {
        this.program = program;
        this.haltChecker = haltChecker;
    }

    @Override
    public void run() {
        boolean stop = haltChecker.halt(program);

        if (stop) {
            System.out.println("Reverse: El programa se detendría, por lo que entro en un bucle infinito");
            while(true){}

        }else {
            System.out.println("Reverse: El programa no se detendría, por lo que termino inmediatamente.");
        }

    }
}
