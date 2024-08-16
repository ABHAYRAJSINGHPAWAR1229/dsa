import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


class DoublingSorting{
    public static void main(String[] args) {
    List<Integer> ls=Arrays.asList(1,8,4,7,2,5);
    // Stream<Integer> temp=ls.stream();
    // Stream<Integer> temp2=temp.map(n->n*n);
    // Stream<Integer> temp3=temp2.sorted();
    // Stream<Integer> temp4=temp3.filter(i->i%2==0);
    // temp4.forEach(a->System.out.println(a));

    ls.stream().map(n->n*n).sorted().forEach(a->System.out.println(a));
    }
}