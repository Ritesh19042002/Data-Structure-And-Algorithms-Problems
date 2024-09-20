package JavaClass;
import java.lang.*;
class myTest extends Thread{
    public void run(){
        for (int i = 0; i <=10; i++) {
            System.out.println("Child Thread");
        }
    }

}
class Test4 implements Runnable{
    public void run(){
        for (int i = 0; i <=10; i++) {
            System.out.println("Child Thread");
        }
    }

}

public class Demo6 {
    public static void main(String[] args) {
        myTest t = new myTest();
        t.start();
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Main Thread");
        }
        System.out.println("//////////////////////////////////////////////////////////");
        Test4 tobj = new Test4();
        Thread T = new Thread();
        T.start();
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Main Thread");
        }
    }
}
