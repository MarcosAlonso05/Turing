package haltproblem;

import programs.CountDown;
import programs.CountUp;
import reverser.Reverser;

public class Main {
    public static void main(String[] args) {
        Program countDown = new CountDown(10);
        Program countUp = new CountUp(1);
        Program reverser1 = new Reverser(countDown);
        Program reverser2 = new Reverser(countUp);

        System.out.println("Executing reverser.Reverser with programs.CountDown:");
        // Esto debería entrar en un bucle infinito
        //reverser1.execute();

        System.out.println("Executing reverser.Reverser with programs.CountUp:");
        // Esto debería detenerse inmediatamente
        reverser2.execute();
    }
}
