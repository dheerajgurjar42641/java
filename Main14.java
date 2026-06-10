import java.util.*;
class Counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}
public class Main14 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable task = () ->{
            for(int i =1;i<=1000000;i++){
                counter.increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("The main thraed ends ... ");

        // t1.join();
        // t2.join();
        System.out.println("Final value of conter is  "+counter.count);
    }
}
