import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CustomOrdering{
    public static void main(String []args){
        List<Integer> ls=new ArrayList<>();
        ls.add(23);
        ls.add(19);
        ls.add(92);
        ls.add(74);
        ls.add(68);

        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return a%10-b%10;                            //comparing the value by its unit digit
        }
        };
        Collections.sort(ls,com);

        System.out.println(ls);
    }
}