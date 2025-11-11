public class cons {
    void showA(){
        System.out.println("This is the A show method ");
    }
    
}
class B extends cons {
    void showB(){
        System.out.println("This is the B show mehtod ");
    }
}
class C extends cons {
    void showc(){
        System.out.println("This is the C show method");
    }
      public static void main(String[] args) {
        cons cs = new cons();
        cs.showA();
        B b = new B();
        b.showA();
        b.showB();
        C c = new C();
        c.showA();
        c.showc();  
      }
}

