
package codeninja;

public class Login implements Email,Password {
    
    private String useremail;
    private int passcode;
    
    public void setuseremail(String useremail)
    {
        this.useremail=useremail;
    }
    public void setpasscode(int passcode)
    {
        this.passcode=passcode;
    }
    
    String getuseremail()
    {
        return this.useremail;
    }
    int getpasscode()
    {
        return this.passcode;
    }
    
    @Override
    public void email()
            
    {
        System.out.println("*                                                   *");
        System.out.println("*                Email: "+getuseremail()+"           *");  
    }
    
   
    @Override
    public void Pass()
        
    {
        System.out.println("*                                                   *");
        System.out.println("*                Passcode: "+getpasscode()+"               *");  
    }

    
   
    
    
    
}
