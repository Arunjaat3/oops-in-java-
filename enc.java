class enc{
   private int emp_id;   // this is the data hiding // 
   public void setEmpid(int e_id){
    emp_id= e_id;                     // this is the encapsulation //  
   }
   public int  getEmpid(){   // ye data ko view karane ke liye h // 
    return emp_id;
   }
}

class company{
    public static void main(String[] args) {
        enc e = new enc();                     
        e.setEmpid(101); 
        System.out.println(e.getEmpid()); // ye data ko view karane ke liye h // 
    } 
}     