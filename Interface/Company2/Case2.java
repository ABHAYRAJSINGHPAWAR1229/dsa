//by interface
interface Com{
    public void language();
}

//by normal class
// class Com{
//     void language(){

//     }
// }

//by abstract method
// abstract class Com{
//     public abstract void language();
// }


class JavaScript implements Com{
   public void language(){
      System.out.println("You are using java-script language");
    }
}

class Java implements Com{
    //here providing public is compulsory if not provided it can't override language
   public void language(){
      System.out.println("You are using java language");
    }
}

class Developer{
    void language(Com lang){
       lang.language();
    }
}

public class Case2{
    public static void main(String []args){
        Com js=new JavaScript();
        Com java=new Java();
        Developer dev = new Developer();
        //now it is loosely coupled
        dev.language(java);

    }
}