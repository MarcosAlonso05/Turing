package abstractFactory.factories;

import abstractFactory.model.NoHaltingP;
import abstractFactory.model.Program;

public class NHaltingFactory implements ProgramFactory {
    @Override
    public Program create() {
        return new NoHaltingP();
    }
}
