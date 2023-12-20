package interview2023.java.Comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String [] args){
        ArrayList<Movies> list = new ArrayList<>();
        list.add(new Movies(100, 1990, "Badal"));
        list.add(new Movies(50, 1980, "Shersah"));
        list.add(new Movies(200, 2023, "Pathan"));

        Collections.sort(list);
//        Iterator<Movies> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().getName());
//        }

        for (Movies m : list){
            System.out.println(m.getName()+ " " + m.getYear()+ " " + m.getRate());
        }
    }
}
