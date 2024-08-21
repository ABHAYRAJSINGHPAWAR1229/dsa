import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class ListComparator implements Comparator<String>{
     @Override
    public int compare(String s1,String s2){
        return s1.compareTo(s2);
    }
}

class File  {
   
    public static void main(String[] args){
        List<String> ls=new ArrayList<>();
        ls.add("Abhay");
        ls.add("Rajat");
        ls.add("Nickey");
        ls.add("Yashi");
        ls.add("Surbhi");
        ls.add("Vashali");

        Collections.sort(ls,new ListComparator());

        System.out.println(ls);
    }
}