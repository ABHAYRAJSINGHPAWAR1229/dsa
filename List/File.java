import java.util.ArrayList;
import java.util.List;

public class File{
    public static void main(String []args){
        List<Integer> ls=new ArrayList<>();
        int arr[]={1,2,3,4,5,6,7};
        for(int a:arr)
        ls.add(a);

        System.out.println("List" +ls);
    }
}
