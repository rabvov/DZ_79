public class noMyRunnable implements Runnable{
    private int x;

    public noMyRunnable(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            x--;
            System.out.println("Поток без с синхронизацией "+x);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
