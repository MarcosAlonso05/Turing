package main.builder.haltchecker;

import main.builder.model.Program;

import java.util.concurrent.*;

public class HaltChecker {
    public boolean halt(Program program) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(program::run);

        try {
            future.get(10, TimeUnit.SECONDS);
            System.out.println("HaltChecker: Programa se ha detenido");
            return true;
        } catch (TimeoutException e) {
            System.out.println("HaltChecker: Programa no para");
            future.cancel(true);
            return false;
        } catch (Exception e) {
            System.out.println("HaltChecker: Error inesperado");
            return false;
        } finally {
            executor.shutdown();
        }
    }
}
