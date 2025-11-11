public class bh {
    String name;
    int emp_id;
    bh(String name, int  emp_id){
        this.name = name;
        this.emp_id = emp_id; 
    }
    public static void main(String[] args) {
        bh b = new bh("arun",101);
        bh b1 = new bh("mohit",102);
           
        System.out.println(b.name+" "+ b.emp_id);
        System.out.println(b1.name+" "+ b1.emp_id); 
    }
    
}
