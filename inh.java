public class inh{
    void eat(){
        System.out.println("I am eating "); 
    }

}
class prince  extends inh {
    public static void main(String[] args) {
        inh n = new inh ();
        n.eat(); 
    }
}