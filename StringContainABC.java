import java.util.ArrayList;
import java.util.List;


class StringContainABC{
    public static void main(String[] args){
        String str="abc";
        String arr[]=str.split("");
        List<String> ls=new ArrayList<>();
        ls.add("abvcd");
        ls.add("abcgf");
        ls.add("xycvd");
        ls.add("sdfabc");
          
          int flag=0;
       List<String> res=new ArrayList<>();
        for(String s :ls){
            flag=0;
            for(int i=0;i<arr.length;i++){
                if(!s.contains(arr[i])){
                    flag=1;
                }
            }
            if(flag==0){
                res.add(s);
            }
        }
        System.out.println(res);
    }
}