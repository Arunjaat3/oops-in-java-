abstract class abstr{
   abstract void start(); 
} 
class Car extends abstr{
     void start(){
      System.out.println("car start with key ");
     } 

}
class Scooter extends abstr{
    void start(){
        System.out.println("Scooter start with kick ");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.start();                             // this is the abstract program in java abstraction in java //  
        Scooter s = new Scooter();
        s.start();                    
    }
}