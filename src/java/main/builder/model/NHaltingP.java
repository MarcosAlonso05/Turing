package main.builder.model;

public class NHaltingP implements Program {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
