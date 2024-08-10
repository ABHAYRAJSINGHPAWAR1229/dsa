import java.util.Scanner;

class Paranthesis{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	String str=sc.next();
        int staCount=0,lasCount=0;
	String arr[]=str.split("");
        for(String s: arr){
		if(s.equals("{") || s.equals("[") )
                    staCount++;
		if(s.equals("}") || s.equals("]") )
                    lasCount++;
                  }
               if(staCount == lasCount)
			System.out.println("Balanced");
		else
           		System.out.println("UnBalanced");
			sc.close();
   }
}
