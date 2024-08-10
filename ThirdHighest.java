class ThirdHighest{
          public static void main(String []args){
		int arr[]=new int[]{1,33,76,4,9,3,86};
		int tv=Integer.MIN_VALUE;
                int sv=Integer.MIN_VALUE;
		int fv=Integer.MIN_VALUE;

               for(Integer i :arr){

                     if(i>fv){
                          tv=sv;
                          sv=fv;
                           fv=i;
			}
                     if(i>sv && i<fv){
				tv=sv;
                                sv=i;
			}
		     if(i>tv && i<sv)
                        tv=i;
		}
		System.out.println(tv);



	}
}
