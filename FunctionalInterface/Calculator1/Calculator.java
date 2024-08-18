

@FunctionalInterface
interface A{
    public void Add();
}


@FunctionalInterface
interface S{
    public void Subtract();
}


@FunctionalInterface
interface M{
    public void Multiply();
}


@FunctionalInterface
interface D{
    public void Divide();
}
// class Calculator{
//     public static void main(String []args){
//         A a=new A(){
//             public void Add(){
//                 System.out.println("Addition");
//         };
//     };
//     a.Add();
//     }
// }

class Calculator{
    public static void main(String []args){
        A a=()->System.out.println("Addition");
        S b=()->System.out.println("Subtraction");
        M c=()->System.out.println("Multiplication");
        D d=()->System.out.println("Division");
          
    a.Add();
    b.Subtract();
    c.Multiply();
    d.Divide();
    }
}