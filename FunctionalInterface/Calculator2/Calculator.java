interface A{
    int Add(int a,int b);
}

interface S{
    int Subtract(int a,int b);
}

interface M{
    float Multiply(int a,int b);
}

interface D{
    float Divide(int a,int b);
}

class Calculator{
    public static void main(String []args){

        //never use same type of variable below here
        A a=(i,j)->i+j;
        S s=(c,k)->c-k;
        M m=(e,f)->e*f;
        D d=(h,g)->h/g;

       float res1= a.Add(3,9);
        float res2=s.Subtract(3,9);
        float res3=m.Multiply(3,9);
        float res4=d.Divide(37,9);

        System.out.println(res1 +" | " +res2 +" | " +res3 +" | " +res4);
        
    }
}