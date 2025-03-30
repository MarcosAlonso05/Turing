package prototype.haltchecker;
import prototype.haltproblem.Program;
import prototype.programs.CountDown;
import prototype.programs.CountUp;

import java.util.HashMap;
import java.util.Map;

public class HaltChecker {
    private static final Map<Class<? extends Program>, Boolean> knownPrograms = new HashMap<>();

    static {
        knownPrograms.put(CountDown.class, true);
        knownPrograms.put(CountUp.class, false);
    }

    public static boolean doesHalt(Program program) {
        return knownPrograms.getOrDefault(program.getClass(), false);
    }
}
