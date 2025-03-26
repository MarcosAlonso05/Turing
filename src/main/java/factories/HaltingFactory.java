package factories;

import model.HaltingP;
import model.Program;

public class HaltingFactory implements ProgramFactory {

    @Override
    public Program create() {
        return new HaltingP();
    }
}
