package interview2023.java.Syncronized;

public class MainThread {
    public static void main(String [] args){
        SyncronizationWishes obj = new SyncronizationWishes();
        SyncronizationThreadClass threadObj = new SyncronizationThreadClass("Raju", obj);
        SyncronizationThreadClass threadObj1 = new SyncronizationThreadClass("Soni", obj);
//        Thread thread = new Thread(threadObj);
//        Thread thread1 = new Thread(threadObj1);
//        thread.start();
//        thread1.start();
        threadObj1.start();
        threadObj.start();

        for (int i=0; i<10; i++){
            System.out.println("Main thread class");
        }
    }
}
