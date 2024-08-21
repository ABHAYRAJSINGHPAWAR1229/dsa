class A{
    private int c;
    
    public A(int c){
        this.c=c;
        
    }
     
    public boolean equals(Object obj){
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        // System.out.println(obj.clone().getClass());
        System.out.println(obj.toString());
        System.out.println(obj.getClass().getName() + "@" + Integer.toHexString(hashCode()));
        
        if(obj instanceof A){
        A other = (A) obj; 
        return this.c== other.c;     
    //    if( this.c==other.c){
    //       return true;
    //    }else{
    //        return false;
    //    }
        }
       
    return false;
    } 
}

public class File{
    public static void main(String []args){
          
      

        A a=new A(2);
        A b=new A(2);
        System.out.println(a.equals(b));
    }

    
}