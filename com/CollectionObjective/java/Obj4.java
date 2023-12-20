package com.CollectionObjective.java;

import java.util.ArrayList;
import java.util.List;

public class Obj4 {

	public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
        
        list.add(10);
        list.add(10);
        
        System.out.print(list.size());
        
        list.remove(10);
        
        System.out.print(list.size());
    }

}
//ArrayList define the overloaded remove() methods as follows :

//- remove(int index)
//- remove(Object object)

//list.remove(10) will try to remove the element at array position 10 and hence throw IndexOutOfBoundException.

//It won't auto-box the int value 10 to Integer and try to remove it.
