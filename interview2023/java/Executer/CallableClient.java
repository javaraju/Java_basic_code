package interview2023.java.Executer;

import java.util.concurrent.Callable;

public class CallableClient implements Callable<Integer> {
    int count;

    public CallableClient(int count) {
        this.count = count;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i=0; i<=count; i++){
            sum = sum + i;
        }
        return sum;
    }
}
