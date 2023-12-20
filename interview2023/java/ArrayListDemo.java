package interview2023.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList();
    
    list.add(10);
    list.add(10);
    
    System.out.println(list.size());
    
    list.remove(new Integer(10));
    
    System.out.println("Size of list is --> " + list.size());
  }

}