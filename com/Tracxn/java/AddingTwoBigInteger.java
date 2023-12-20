package com.Tracxn.java;

import java.util.ArrayList;
import java.util.Collections;

public class AddingTwoBigInteger {
    static Integer carry = 0;
    public static void main(String args[]){
        String s1 = "76547298503289976310072859981635501045";
        String s2 = "5980139243970186632651869926335829102";
        add(s1, s2);
    }

    public static void add(String a, String b){
        ArrayList<String> res = new ArrayList<String>();
        //StringBuilder myString = null;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(true){
            int i1 =a.charAt(i)-'0'; //Integer.parseInt(Character.toString(a.charAt(i)));
            int i2 =b.charAt(j)-'0';// Integer.parseInt(Character.toString(b.charAt(j)));
            Integer i3  = i1 + i2 + carry;
            if(i3 > 9){
                carry = 1;
                i3 = i3 - 10;
            }else carry = 0;
            res.add(i3.toString());
           // res.add(i3);
            i--;j--;
            if(i <= 0){
                res.add(carry.toString());
               // res.add(carry);
                break;
            }
        }
        for(int m=res.size()-1;m>=0;m--)
        {
        	System.out.print(res.get(m));
        }
        /*Collections.reverse(res);
        for(String r : res){
            System.out.print(r);
        }*/
    }
}
