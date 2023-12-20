package interview2023.java.Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadExecuter {

    public static void main(String [] args){
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Task1 execute start....");
                try {
                    Thread.sleep(200);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }

                System.out.println("Task1 execute end....");
            }
        };

        Runnable task2 = () ->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task2 execute start....");
            try {
                Thread.sleep(200);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println("Task2 execute end....");
        };

        Runnable task3 = () ->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task3 execute start....");
            try {
                Thread.sleep(200);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println("Task3 execute end....");
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();
    }

}
