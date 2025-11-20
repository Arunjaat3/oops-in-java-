class A{
    void a(){
        System.out.println("function of A ");
    }

}
class B extends A{
    void b(){
        System.out.println("function of b ");
    }
}
class C extends B {
    void c(){
        System.out.println("this is the function c ");
        
    }  
}
class D extends B {
    void d(){
        System.out.println("This is the funciton D");
    }
}
class main {
    public static void main(String[] args) {
        C cd = new C();
        cd.a();  // hum c  object se a , b, c ko call kara sakte h // 
        cd.b();
        cd.c();
        D dd = new D(); // hum d object se a, b, d ko call kara sakte h // 
        dd.a();
        dd.b();
        dd.d();      // ye h hybrid inheritance in java //        
    }
}