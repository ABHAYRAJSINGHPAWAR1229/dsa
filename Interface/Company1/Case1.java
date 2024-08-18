class Javascript{
    public void lang(){
        System.out.println("You use Javascript");
    }
}

class Java{
    public void lang(){
        System.out.println("You use Java");
    }
}

class Developer{
    //problem arrise here developer know only one language and argument is hard coded 
    public void lang(Javascript js) {
        js.lang();
}
}

class Case1{
    public static void main(String []args){
        Javascript m1=new Javascript();
        Java m2=new Java();

         Developer d=new Developer();
         //company is not able to provide another language to his/her java developer
         d.lang(m1);
    }
}