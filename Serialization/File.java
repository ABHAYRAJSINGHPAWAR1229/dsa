import java.io.*;

class User implements Serializable{
     private static final long serialVersionUID= -240340120003L;
    private int id;
    private String name;
    private String password;

    public User(int id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }


}


public class File{
    public static void main(String []args){
            SerialiazableUser();
    }


private static void SerialiazableUser(){
    User user=new User(1,"Abhay","1229");
    

    try{
        //here we create FileOutputStream object named fileOut.This is used to write data to a file named user.txt
        //Actually it defines in which we write our Serialized file with the help of FileOutputStream.
        FileOutputStream file = new FileOutputStream("user.txt");
        
        //Creates ObjectOutputStream named out .

        //ObjectOutputStream helps you save an object's state by converting it into binary format and writing it to a stream.
        ObjectOutputStream out = new ObjectOutputStream(file);
        //this is used to write Java object to underlying File Output Stream.
        //API methods ---
         //public void writeInt(int i) throws IOExc
          //public void writeChar(char i) throws IOExc
        //public void writeFloat,writeDouble.....
               //For Strings 
        //public void writeUTF(String s) throws IOExc ---uses Modified UTF 8 convention
         //+
            //public void writeObject(Object o) throws IOException,NotSerializableException

        out.writeObject(user);
        System.out.println("Object Serialized Successfully");
        out.flush();
        out.close();
        file.close();
    }catch(Exception e){
        System.out.println(e);
    }
}
}

