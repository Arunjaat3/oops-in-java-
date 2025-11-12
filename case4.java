public class case4 {
    void show(StringBuffer a ){
        System.out.println("StringBuffer method"); 
    }
    void show(String a ){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        case4 c = new case4();
        c.show("abc");      
    }
    
}  
  