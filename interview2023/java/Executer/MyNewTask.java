package interview2023.java.Executer;

public class MyNewTask implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Task3......");
    }
}
