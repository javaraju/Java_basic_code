package com.hackerrank.java;

public class SearchSubString {
	public static String findSub(String[] arr)
	{
		int arrlen=arr.length;
		String s=arr[0];
		int slen=s.length();
		String find="";
		for(int i=0;i<slen;i++)
		{
			for(int j=i+1;j<=slen;j++)
			{
				String subFind=s.substring(i, j);
				int k=1;
				for(k=1;k<arrlen;k++)
				{
				
					if(!arr[k].contains(subFind))
					{
					
						break;
					}
				}
					
			    if(k==arrlen  &&find.length()<subFind.length())
				{
					find=subFind;
				}
					
				}
			}
		return find;
		}
		
	
		
		
		    
		 

	public static void main(String[] args) {
		String arr[] = { "grace", "graceful", "disgraceful", 
        "gracefully" };
		String sub=findSub(arr);
		System.out.println(sub);
		//findSub(arr);

	}

}
