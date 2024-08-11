import java.util.HashSet;
import java.util.*;
class SimilarWord{
       public static void main(String []args){
         String str1="ababc";
         String str2="nmnmr";
       
        String arr1[]=str1.split("");
	String arr2[]=str2.split("");

        HashSet<String> hs1=new HashSet<String>(Arrays.asList(arr1));
        HashSet<String> hs2=new HashSet<String>(Arrays.asList(arr2));

	String gen1="";
        String gen2="";
        int count=0;

       for(String s : hs1){
           System.out.println("From Hashset" +s);
		count++;
             for(String a:arr1){
                   if(s.equals(a)){
                        System.out.println("I" +s +" : " +a  +" count " +count);
                       gen1+=count;
                       System.out.println("gen1 =>" +gen1);
                     }
                  }
                 }
        count=0;
       for(String s:hs2){
		count++;
           for(String a:arr2){
                   if(s.equals(a)){ System.out.println("II" +s +" : " +a  +" count " +count);
                       gen1+=count;
                       System.out.println("gen2 =>" +gen2);
			}
			}
			}
            System.out.println(gen1);
            System.out.println(gen2);
}
}
