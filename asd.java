public class asd {
    void show(){
        System.out.println("1");
    }
    
}
class abc extends asd{    
    void show(){
        System.out.println("2"); 
    }
    public static void main(String[] args) {
         asd a = new asd();
         a.show(); 
         abc b = new abc();
         b.show(); 
    }
}
