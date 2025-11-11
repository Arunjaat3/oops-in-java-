class animal{
    public void eat(){
        System.out.println(" I am eating ");
    }
    public static void main(String[] args) {
            animal a = new animal();
            a.eat();
            Birds b = new Birds();
            b.fly();
                      
    }
}  
class Birds{
      void fly(){
             System.out.println("I am flying ");
        }
    }  