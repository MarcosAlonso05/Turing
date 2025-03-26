package prototype.programs;
import prototype.haltproblem.Program;

public class CountUp implements Program {
    private int num;

    public CountUp(int num) {
        this.num = num;
    }

    @Override
    public void execute() {
        while (true) {
            System.out.println(num);
            num++;
        }
    }

    @Override
    public Program clone() {
        return new CountUp(this.num);
    }
}