enum Laptop{
    DELL(70000),ACER(3500),HP(40000),MACBOOK(92000);

    private int price;
     Laptop(int price){
          this.price=price;
    }
    
    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}

class Lap{
    public static void main(String[] args) {
      for(Laptop l:Laptop.values()){
        System.out.println(l.name() +" : "+l.getPrice());
      }

    }
}