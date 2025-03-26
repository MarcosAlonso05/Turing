package prototype.programs;
import prototype.haltproblem.Program;

public class CountDown implements Program {
    private int num;

    public CountDown(int num) {
        this.num = num;
    }

    @Override
    public void execute() {
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }

    @Override
    public Program clone() {
        return new CountDown(this.num);
    }
}

