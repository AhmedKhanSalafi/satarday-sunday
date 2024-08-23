package Threading;

public class MainC {

    public static void main(String[] args) {

        Table obj=new Table();

        Thread1 thread1=new Thread1(obj);

        Thread2 thread2=new Thread2(obj);

        thread1.start();

        thread2.start();
    }
}
