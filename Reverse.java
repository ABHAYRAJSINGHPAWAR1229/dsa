import java.lang.*;

public class Reverse{
   public static void main(String[] args){
     String str="My name is Abhay";
     StringBuilder sb=new StringBuilder(str);
     sb=sb.reverse();
     System.out.println(sb.toString());
    }
}
