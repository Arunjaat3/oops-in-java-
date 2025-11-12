public class case1 {
    void show(int a ){
        System.out.println("int method"); // ye int method m chala jagya int method ko hi call karegya // 
    }
    void show(String a ){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        case1 c = new case1();
        c.show(20); 
    }
    
}
