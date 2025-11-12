public class case3 {
    void show(int a ){
        System.out.println("int method"); // ye int   method m chala jagya int   method ko hi call karegya // 
    }
    void show(String a ){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        case3 c = new case3();
        c.show('a');    // ye chala jagya int method m // 
    }
    
}
  