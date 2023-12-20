package interview2023.java.Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecuter {

    public static void main(String [] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Task1 execute....");
            }
        };

        Runnable task2 = () ->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task2 execute....");
        };

        executorService.submit(task1);
        executorService.submit(task2);
        MyNewTask task3 = new MyNewTask();
        executorService.submit(task3);
        executorService.shutdown();
    }
}
