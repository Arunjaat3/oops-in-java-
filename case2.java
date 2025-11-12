public class case2 {
    void show(int a ){
        System.out.println("int method"); // ye String  method m chala jagya String  method ko hi call karegya // 
    }
    void show(String a ){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        case2 c = new case2();
        c.show("abc");  
    }
    
}
 