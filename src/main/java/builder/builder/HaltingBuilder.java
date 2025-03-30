package builder.builder;

import builder.model.HaltingP;
import builder.model.Program;

public class HaltingBuilder implements PBuilder {

    @Override
    public Program build() {
        return new HaltingP();
    }
}
