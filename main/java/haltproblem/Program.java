package haltproblem;

public interface Program extends Cloneable {
    void execute();
    Program clone();
}
