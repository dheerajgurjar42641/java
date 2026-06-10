// wrute a thread with two threads. one hold even no from 1 to 10 and another one odd no . use thread.sleep() method to 
// space out the printing so you can alternating them. 
import java.util.*;
public class Main15 {
    public static void main(String[] args) {
        System.out.println("main thread starts.....");
        Thread oddThread = new Thread(() ->{
            for(int i = 1;i<=9;i+=2){
                System.out.println("Odd"+i);
                try{Thread.sleep(300);}catch(InterruptedException e){}
            }
        });
        Thread evenThread = new Thread(() ->{
            for(int i = 2;i<=10;i+=2){
                System.out.println("Even"+i);
                try{Thread.sleep(300);}catch(InterruptedException e){}
            }
        });
        oddThread.start();
        evenThread.start();
    }
}
