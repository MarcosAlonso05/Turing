package prototype;

import prototype.haltchecker.HaltChecker;
import prototype.haltproblem.Program;
import prototype.programs.CountDown;
import prototype.programs.CountUp;
import prototype.reverser.Reverser;

public class Main {
    public static void main(String[] args) {
        Program countDown = new CountDown(10);
        Program countUp = new CountUp(1);
        Program reverser1 = new Reverser(countDown);
        Program reverser2 = new Reverser(countUp);

        System.out.println("Ejecutando Reverser con CountDown:");
        // Esto debería entrar en un bucle infinito
        //reverser1.execute();

        System.out.println("Ejecutando Reverser con CountUp:");
        // Esto debería detenerse inmediatamente
        reverser2.execute();
    }
}
