public class bb {
    int a = 10;

     
}
class b extends bb{
    int a = 20;
    void show(int a ){
        System.out.println(super.a); // ye tho parent class ki value ko print kara dega ye super keyword h  // 
        System.out.println(this.a);  // ye aapni hi class ki value ko print kara dega  ye this keyword h //
        System.out.println(a);    // ye bhi apni class ki value ko print kara dega // 
    }
    public static void main(String[] args) {  
        b a = new b();        
        a.show(30); 
    }
}
