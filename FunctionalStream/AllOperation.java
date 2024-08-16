import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class AllOperation{
    public static void main(String[] args) {
      List<Integer> ls=Arrays.asList(6,44,22,99,66,11);

      //Checking all list element
      Stream<Integer> t1=ls.stream();
      t1.forEach(w->System.out.println(w));

      //Checking number of element
      Stream<Integer> t2=ls.stream();
      System.out.println("Count " +t2.count());

      //Print even 
      System.out.println("Even ");
      Stream<Integer> t3=ls.stream();
      t3.filter(n->n%2==0).forEach(a->System.out.println(a));

     //Doubling data element
     System.out.println("Doubling data element");
     Stream<Integer> t4=ls.stream();
     t4.map(x->x*x).forEach(a->System.out.println(a));

     //doubling and give odd numbers
     System.out.println("Doubling and give odd numbers");
     Stream<Integer> t5=ls.stream();
     t5.map(q->q*q).filter(i->i%2==1).forEach(a->System.out.println(a));
   
      //doubling and sorting and even
    System.out.println("Doubling and sorting and even");
    Stream<Integer> t6=ls.stream();
    t6.map(x->x*x).sorted().filter(a->a%2==0).forEach(a->System.out.println(a));


    }

    //doubling and sorting and even

}