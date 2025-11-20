interface a{
    void show(); // ye method by default public and abstract h // 
}
 interface b {
    void show();
 }
 class arun implements a , b{
   public  void show(){ // yaha pe hume public likhna padega default public se chota  hota h //   
        System.out.println("interface a and b "); // ye code h multiple inheritanc ka jisse hum interface ke through achieve karenge//  
    } 
    public static void main(String[] args) {
        arun a = new arun();
        a.show(); 
    }     
 }