package prototype.reverser;

import prototype.haltproblem.Program;
import prototype.haltchecker.HaltChecker;

public class Reverser implements Program {
    private Program input;



    @Override
    public void run() {
        HaltChecker haltChecker = new HaltChecker();
        boolean willHalt = haltChecker.checkHalt(input);

        if (willHalt) {
            System.out.println("HaltChecker dice que el programa para... ¡entrando en bucle infinito!");
            int i = 0;
            while (true) {
                System.out.println("Reverser ejecutándose... " + i++);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("HaltChecker dice que el programa NO para... ¡terminando inmediatamente!");
        }
    }

    @Override
    public Program clone() {
        return new Reverser();
    }

    @Override
    public String getName() {
        return "Reverser";
    }

    @Override
    public void setInput(Program input) {
        this.input = input;
    }
    public Program getInput() {
        return input;
    }
}