class Switches2{
    public static void main(String []args){
        var name="Abhay";
        var course="";

        course=switch(name){
            case "Abhay" : yield "DAC";
            case "Abhinav" : yield "DBDA";
            case "Abhishek" : yield "DITISS";
            case "Vidya" : yield "DHPCA";
            default : yield "NOT FROM CDAC";
        };

        System.out.println(course);
    }
}