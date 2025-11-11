public class multilevel {
    void showA(){
        System.out.println("this is the A class Method ");
    }
    
}
class B extends multilevel{
  void showb(){
    System.out.println("this is the b show method ");
  }    
}
class C extends multilevel{
    void showc(){
        System.out.println("This is the c class method ");
    }
    public static void main(String[] args) {
        multilevel m = new multilevel();
        m.showA();
        B b = new B();
        b.showA();
        b.showb();
        C c = new C();
        c.showA();
        c.showc(); 
    }
}

