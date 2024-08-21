class Switches{
    public static void main(String []args){
        var name="Abhay";
        var course="";

        course=switch(name){
            case "Abhay"->"DAC";
            case "Abhinav"->"DBDA";
            case "Abhishek"->"DITISS";
            case "Vidya"->"DHPCA";
            default->"NOT FROM CDAC";
        };

        System.out.println(course);
    }
}