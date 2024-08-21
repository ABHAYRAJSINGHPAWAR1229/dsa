import java.io.*;


class User implements Serializable{
    private static final long serialVersionUID= -240340120003L;
    public int id;
    private String name;
    private String password;

    public User(int id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }


}

public class File{
    public static void main(String []args){
        deserializableUser();
          
    }

    private static void deserializableUser(){
        User user=null;

        try{
            FileInputStream file=new FileInputStream("user.txt");
            ObjectInputStream marker=new ObjectInputStream(file);
            user=(User)marker.readObject();
            System.out.println(user.id +" | " +user.getName() +" | " +user.getPassword());
            marker.close();
            file.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}