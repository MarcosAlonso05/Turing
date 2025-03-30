package prototype.programs;

import prototype.haltproblem.Program;

public class CountUp implements Program {
    private int start;
    private Program input; // No usado en este programa

    public CountUp(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        int i = start;
        while (true) {
            System.out.println("CountUp: " + i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Program clone() {
        return new CountUp(this.start);
    }

    @Override
    public String getName() {
        return "CountUp";
    }

    @Override
    public void setInput(Program input) {
        this.input = input;
    }
}