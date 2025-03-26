package prototype.reverser;

import prototype.haltproblem.Program;
import prototype.haltchecker.HaltChecker;

public class Reverser implements Program {
    private Program program;

    public Reverser(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        if (HaltChecker.doesHalt(program.clone())) {
            while (true) {
                System.out.println("Loop infinito.");
            }
        } else {
            System.out.println("Parada inmediata.");
        }
    }

    @Override
    public Program clone() {
        return new Reverser(this.program.clone());
    }
}

