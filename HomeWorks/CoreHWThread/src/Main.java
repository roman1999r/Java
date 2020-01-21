import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();


    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість чисел: ");
        int f = sc.nextInt();
        int a = 1;
        int b =1;
        int c;
        System.out.print("Потік Thread: "+a+" "+b+" ");
        for(int i = 3; i <= f; i++){
            try {
                Thread.sleep(1000,00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();

        // 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
    }
}
