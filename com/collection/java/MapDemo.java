package com.collection.java;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class MapDemo {

	public static void main(String[] args) {

TreeMap<String,String> hm=new TreeMap<String,String>();
hm.put("Banana","Kela");
hm.put("Apple","Seb");
hm.put("Orange","Narangi");
System.out.println(hm);
System.out.println("Value of Second:-> "+hm.get("Apple"));
System.out.println("Is Tree map Empty:-> "+hm.isEmpty());
hm.remove("Banana");
System.out.println(hm);
Set<String> s=hm.keySet();
for(String sb:s)
{
	System.out.println("The value of "+sb+" is:-- "+hm.get(sb));
} 
Set<Map.Entry<String,String>> sss=hm.entrySet();
System.out.println(sss);
for(Map.Entry<String,String> Double:sss)
{
	System.out.println(Double);
}


	}

}
