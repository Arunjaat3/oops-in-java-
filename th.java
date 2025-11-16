public class th {
        int i;
        void setValues(int i){
            this.i = i;       // this is the use of this keyword in java // 
                    // this keyword ki help se hum same variable ki value print kara sakte h //  
        }   
        void show(){
            System.out.println(i); 
        } 

}
class xyz{
    public static void main(String[] args) {
        th t = new th();
        t.setValues(10);
        t.show(); 
    }
}