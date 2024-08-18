import java.util.List;
import java.util.ArrayList;

class ListIteration{
    public static void main(String []args){
        List<String> product=new ArrayList<>();
        product.add("Mobile");
        product.add("Bottle");
        product.add("Copy");
        product.add("table");

        //Print all product in a line
        System.out.println("Print all product in a line");
        System.out.println(product);

        //Print by for loop
        System.out.println("Print by for loop");
        for(String s : product)
           System.out.println(s);
    }
}