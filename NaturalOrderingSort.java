import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class NaturalOrderingSort{
    public static void main(String []args){
        List<Integer> numy=new ArrayList<>();
        numy.add(72);
        numy.add(33);
        numy.add(18);
        numy.add(90);
        numy.add(24);
        numy.add(55);

        Collections.sort(numy);

        //all in one line
        System.out.println(numy);

        //seprate element are fetch inside List
        for(Integer i: numy){
            System.out.println(i);
        }
    }

}