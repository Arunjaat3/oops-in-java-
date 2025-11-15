interface inter {
      void show();
  
          
}
class test implements inter{
   public void show() {
        System.out.println("hello");
  
    }
    public static void main(String[] args) {
        test t = new test(); 
        t.show();    
    }
}
