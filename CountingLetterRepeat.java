import java.util.HashSet;
import java.util.*;

class CountingLetterRepeat{
			public static void main(String args[]){
			int count=0;
			String str="my name is abhay raj singh";
			String arr[]=str.split("");
                        HashSet<String> hs=new HashSet<>(Arrays.asList(arr));
                         for(String s:hs){
				count=0;
                              for(String com:arr){
                                  if(s.equals(com))
					count++;
					}
				System.out.println(s +" times "+count);				}
		}


}
