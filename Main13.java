import java.util.*;
class mythread extends Thread{
    @Override
    public void run(){
        for(int i =1;i<=3;i++){
            System.out.println("my tread (Thead class ) is running "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e ){
                System.out.println("thraed interruptupted");
            }
        }
    }
}
class myrunable implements Runnable{
    @Override
    public void run(){
        for(int i = 1;i<=3;i++){
            System.out.println("Myrunnable(Runnable interface) is runing");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e ){
                System.out.println("thraed interruptupted");
            }
        }
    }

}
public class Main13 {
    public static void main(String[] args) {
        System.out.println("Main Thread starts.....");
        // mythread thread1 = new mythread();
        // mythread thread2 = new mythread();
        Thread thread1 = new Thread(new myrunable());
        Thread thread2 = new Thread(new myrunable());
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("The main thraed ends ... ");
    }
}
