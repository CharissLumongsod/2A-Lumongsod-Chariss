
package codeninja;

public class Services extends Option {
    
    private String Benefits;
   Services()
   {
   }
   
     public Services(String Title,String Content)
   {
      super(Title,Content);
     
   }
     
    void setBenefits(String Benefits)
    {
        this.Benefits=Benefits;
    }
    
    String getBenefits()
    {
        return this.Benefits;
    }
    
     @Override
   public void display()
   {
       super.display();
       System.out.println("*--------------------------------------------------------------- B_E_N_E_F_I_T_S -----------------------------------------------------------*\n*                                                                                                                                           *"+getBenefits());
   }
    
    
    
}
