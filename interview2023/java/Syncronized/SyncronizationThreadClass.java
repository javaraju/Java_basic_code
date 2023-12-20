package interview2023.java.Syncronized;

public class SyncronizationThreadClass extends Thread{
    String name;
    SyncronizationWishes syncronizationWishes;
    SyncronizationThreadClass(String name, SyncronizationWishes syncronizationWishes){
        this.name=name;
        this.syncronizationWishes=syncronizationWishes;
    }
    @Override
    public void run(){
       syncronizationWishes.wish(name);
    }
}
