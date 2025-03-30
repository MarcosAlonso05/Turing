package prototype.haltchecker;

import prototype.haltproblem.Program;
import prototype.reverser.Reverser;

public class HaltChecker {
    public boolean checkHalt(Program program) {
        // Simulación simplificada del halt checker
        // En la realidad, esto no puede existir para todos los casos

        if (program.getName().equals("CountDown")) {
            return true;
        } else if (program.getName().equals("CountUp")) {
            return false;
        } else if (program.getName().equals("Reverser")) {
            // Esto demuestra la paradoja
            Reverser reverser = (Reverser) program;
            return !checkHalt(reverser.getInput());
        }

        // Para otros programas, asumimos que paran (simplificación)
        return true;
    }
}