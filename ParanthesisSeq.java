import java.util.Scanner;
class ParanthesisSeq{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter the brackets");
                String str=sc.next();
  		int l=str.length();
                 String arr[]=str.split("");
			for(String f:arr)
//                 System.out.println(f);
System.out.println(l);
                if(l%2==1)
  //                System.out.println("Unbalanced");
                else{
		  for(int i=0;i<=l/2-1;i++){
                        System.out.println(arr[i] +" == " +arr[l-i-1]);
                       if((arr[i].equals("{") && arr[l-1-i].equals("}") ) || ( arr[i]=="[" && arr[l-1-i] =="]"))
                           continue;
 				// System.out.println("Balanced");
                        else
                               System.out.println("Unbalanced");
                                break;
                         }





                    }
    }


}
