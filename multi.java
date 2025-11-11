public class multi {
    void showA(){
        System.out.println("This is the A show method ");
    }
    
}
class B extends multi{
    void showb(){
    System.out.println("This is the B show method ");
    }
}
class C extends B{
    void showc(){
        System.out.println("this is the c show method ");
    }
    public static void main(String[] args) {
        multi m = new multi();
        m.showA();
        B b = new B();
        b.showA();
        b.showb();
        C c = new C();
        c.showb();
        c.showA();
        c.showc(); 
    }
}

