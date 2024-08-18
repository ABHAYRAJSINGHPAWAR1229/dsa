class A{
    public void show(){
        System.out.println("You are in A Class");
    }
}

class B extends A{
    @override
    public void show(){
        System.out.println("You are in B Class");
    }

}


class Anno{
    public static void main(String[] args){
     B msg=new B();
     msg.show();
    }
}