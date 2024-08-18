public class GreatestNum{
        public static void main(String []args){
		int arr[]=new int[]{7,32,12,98,32,54,87};
		int m=Integer.MIN_VALUE;
                for(Integer g :  arr)
                   {
                            if (m<g)
				{
					m=g;
				}

                   }
                 System.out.println("Greatest number is " +m);

}
}
