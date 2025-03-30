package main.builder.builder;

import main.builder.model.HaltingP;
import main.builder.model.Program;

public class HaltingBuilder implements PBuilder {

    @Override
    public Program build() {
        return new HaltingP();
    }
}
