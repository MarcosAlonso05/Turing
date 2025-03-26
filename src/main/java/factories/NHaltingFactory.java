package factories;

import model.NoHaltingP;
import model.Program;

public class NHaltingFactory implements ProgramFactory {
    @Override
    public Program create() {
        return new NoHaltingP();
    }
}
