package interview2023.java.Syncronized;

public class SyncronizationWishes {

    public synchronized void wish(String name){
        try {
            for (int i=0;i<10;i++) {
                System.out.println("Good morning :- " + name);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("got interupted.");
        }

    }
}
