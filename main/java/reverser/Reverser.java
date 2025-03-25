package reverser;

import haltproblem.Program;
import programs.HaltChecker;

public class Reverser implements Program {
    private Program program;

    public Reverser(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        if (HaltChecker.doesHalt(program.clone())) {
            while (true) {
                System.out.println("Looping indefinitely...");
            }
        } else {
            System.out.println("Halting immediately.");
        }
    }

    @Override
    public Program clone() {
        return new Reverser(this.program.clone());
    }
}

