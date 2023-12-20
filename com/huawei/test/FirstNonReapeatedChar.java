package com.huawei.test;

public class FirstNonReapeatedChar {
     // final static String s = "cascade";
      public static void main(String[] args) {
    //char[] charArr = string.toCharArray();
    	 String s = "cascade";
      for (int i=0;i<s.length();i++) 
        {
            int count=0;
            for(int j=0;j<s.length();j++) 
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println("First Non Repeating Character is: "
            + s.charAt(i));
                break;
            }
        }

    }

}
