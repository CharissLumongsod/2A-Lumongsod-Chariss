
package codeninja;

public class Contacts extends Option {
    private String staff;
    
    public Contacts()
    {
    }
    
     public Contacts(String Title,String Content)
   {
      super(Title,Content);
   }
   
   void setstaff(String staff)
    {
        this.staff=staff;
    }
    
    String getstaff()
    {
        return this.staff;
    }
    
     @Override
   public void display()
   {
       super.display();
       System.out.println("*                                                             <Contact Information>                                                         *\n" +getstaff());
   }
}
