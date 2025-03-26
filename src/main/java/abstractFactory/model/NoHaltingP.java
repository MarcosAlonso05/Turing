package abstractFactory.model;

public class NoHaltingP implements Program {
    @Override
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            i++;
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
