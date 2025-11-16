public class ad {
    ad(){
        System.out.println("i am in ad class method");
    }
}
class b extends ad{
    b(){
        super();  // ye super keyword constructor ke case m use karte h  jise m breckets aayi hoti h  //             
        System.out.println(" i am in b class method bro ");
    }
    public static void main(String[] args) {
        b ab = new b();     
    }
}
