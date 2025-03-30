package abstractFactory.factories;

import abstractFactory.model.HaltingP;
import abstractFactory.model.Program;

public class HaltingFactory implements ProgramFactory {

    @Override
    public Program create() {
        return new HaltingP();
    }
}
