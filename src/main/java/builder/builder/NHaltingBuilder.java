package builder.builder;

import builder.model.Program;
import builder.model.NHaltingP;

public class NHaltingBuilder implements PBuilder {

    @Override
    public Program build() {
        return new NHaltingP();
    }
}
