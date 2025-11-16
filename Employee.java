public class Employee {
    int emp_id;
    String name;
     static String Company ="Smart Programming";    // memory management ke kaam aata h static variable // 
                                            // static ke keyword h // 
     Employee(int emp_id, String name) {
        this.emp_id=emp_id;
        this.name=name;
    }
    void display(){
        System.out.println(emp_id+" "+name+" "+Company);
    }
    public static void main(String[] args) {
        Employee e = new Employee(101, "amit");
        e.display();
        Employee e2 = new Employee(102,"ajay"); // jo chij baar baar repeat ho rhi h usse kaam karne ke liye hum static keyword ka use karte h jiss se memory m kaam space occupy ho // 
        e2.display(); 
    }
    
    
}
