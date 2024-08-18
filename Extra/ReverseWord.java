class ReverseWord{

		public static void main(String[] args){
                 String str="My name is Abhay";
                 String splitStr[] = str.split(" ");
                 String rev="";
                  StringBuffer sb;
                 for(String s : splitStr)
			{
                          sb=new StringBuffer(s);
                          sb=sb.reverse();
                          rev +=sb +" ";
                        }
                   System.out.println(rev);

          }
}
