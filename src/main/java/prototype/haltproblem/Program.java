package prototype.haltproblem;

public interface Program extends Cloneable {
    void run();
    Program clone();
    String getName();
    void setInput(Program input);
}
