public class sup {
    int a = 10;
    
}
class abc extends sup{
    int a = 20; 
    void show(int a ){
      System.out.println(super.a);  // this is the use of super keyword in java bro // 
      }                              // inheritance ka bhi use hoga in super keyword in java //          
    public static void main(String[] args) {
         abc a = new abc();
         a.show(80);  
                       
    }
}
