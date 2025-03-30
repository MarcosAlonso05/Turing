package main.builder.builder;

import main.builder.model.Program;
import main.builder.model.NHaltingP;

public class NHaltingBuilder implements PBuilder {

    @Override
    public Program build() {
        return new NHaltingP();
    }
}
