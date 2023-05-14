import java.util.Scanner;


public class DZ_79 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        myRunnable myRunnable = new myRunnable(number);
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);

        noMyRunnable noMyRunnable = new noMyRunnable(number);
        Thread thread3 = new Thread(noMyRunnable);
        Thread thread4 = new Thread(noMyRunnable);

        thread1.start();
        thread.start();
        thread3.start();
        thread4.start();






    }


}
