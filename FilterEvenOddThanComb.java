//sequencing odd and even without disturbing its sequence

import java.util.List;
import java.util.ArrayList;

class FilterEvenOddThanComb{
    public static void main(String []args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(71);
        numbers.add(92);
        numbers.add(33);
        numbers.add(66);
        numbers.add(22);
        numbers.add(53);
        
        List<Integer> ev=new ArrayList<>();
        List<Integer> od=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        
        for(Integer i :numbers){
            if(i%2==0)
                ev.add(i);
            else
                 od.add(i);    
        }

        int len1=ev.size();
        int len2=od.size();

       for(int i=0;i<ev.size();i++){
            res.add(ev.get(i));
            res.add(od.get(i));
       }

       System.out.println(res);

    }
}