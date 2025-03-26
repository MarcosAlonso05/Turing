package abstractFactory.model;

public class HaltingP implements Program {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("El programa se para en " + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
