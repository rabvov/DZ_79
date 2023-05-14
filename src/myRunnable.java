public class myRunnable implements Runnable {
    private int x;

    public myRunnable(int x) {
        this.x = x;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            x--;
            System.out.println("Поток с синхронизацией "+x);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
