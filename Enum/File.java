enum Status{
    Running,Pending,Waiting,Failed;
}

public class File{
    public static void main(String []args){

        Status stat=Status.Running;

        if(stat==Status.Running){
            System.out.println("Running");
        }
        else if(stat==Status.Pending){
            System.out.println("Pending");
        }
        else if(stat==Status.Waiting){
            System.out.println("Waiting");
        }else{
            System.out.println("Failed");
        }
    }
}