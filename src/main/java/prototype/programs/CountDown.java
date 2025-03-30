package prototype.programs;

import prototype.haltproblem.Program;

public class CountDown implements Program {
    private int start;
    private Program input; // No usado en este programa, pero parte de la interfaz

    public CountDown(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i >= 0; i--) {
            System.out.println("CountDown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("CountDown ha terminado.");
    }

    @Override
    public Program clone() {
        return new CountDown(this.start);
    }

    @Override
    public String getName() {
        return "CountDown";
    }

    @Override
    public void setInput(Program input) {
        this.input = input;
    }
}