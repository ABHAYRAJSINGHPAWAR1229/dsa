class Rhyming{
	public static void main(String []args){
         String str1="Monkey";
         String str2="Donkeu";
	String arr1[]=str1.split("");
	String arr2[]=str2.split("");

	int len1=str1.length()-4;
        int len2=str2.length()-4;

         String res="";
        for(int i=0;i<3;i++){
	  if(!arr1[len1+i].equals(arr2[len2+i]))
		{
              System.out.println(arr1[len1+i] +"  ||  " +arr2[len2+i]);
              res+="Not Rhym";
		break;
		}
		}

	if(res.equals(""))
		res+="Rhymming";

		System.out.println(res);
	}
}


