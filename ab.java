interface a  {
    void show();
    
}
interface b {
    void display();
}
class ab  implements a , b{
    public void show(){
        System.out.println(" this is the show method"); // aab iss m alag alag name se method h // 
    }
    public void display(){
        System.out.println("this is the display method "); // ye multiple inheritance ka program h //    
    }
    public static void main(String[] args) {
        ab ad = new ab();
        ad.show();
        ad.display();  
    }

}
