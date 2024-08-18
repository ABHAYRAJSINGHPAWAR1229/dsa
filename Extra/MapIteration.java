import java.util.Map;
import java.util.HashMap;
public class MapIteration{
    public static void main(String[] args) {
       Map<String,Integer> student=new HashMap<>();
       student.put("Abhay",98);
       student.put("Abhimanyu",99);
       student.put("Akrati",85);
       student.put("Tanvi",89);
       student.put("jay",87);
       student.put("Akrati",88);           //replace old akrati value
        
        //as an object print map
        System.out.println("Full Map");
       System.out.println(" In mapped form " +student);

       //specific key element value we want
       System.out.println("By Key");
       System.out.println("Abhay marks are " +student.get("Abhay"));

       //print all keys
       System.out.println("All keys");
       System.out.println(student.keySet());
       
       //All by seq
       System.out.println("By Sequence");
       for(String s : student.keySet())
        System.out.println(s +" get marks " +student.get(s));


    }
}