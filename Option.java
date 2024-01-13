
package codeninja;

import java.io.IOException;
import java.util.InputMismatchException;

public class Option {
  
    private String Content;
    private String Title;
    
    Option()
    {}
    //constructor with parameter
    Option(String Title,String Content)
    {
        this.Content=Content;
        this.Title=Title;
    }
    
    //Setters
    public void setContent(String Content)
    {
        this.Content=Content;
    }
    public void setTitle(String Title)
    {
        this.Title=Title;
    }
   
    
     //Getters
     
     public String getContent()
     {
         return this.Content;
     }
     public String getTitle()
     {
         return this.Title;
     }
     
     public void display()
     {
        System.out.println(getTitle());
        System.out.println(getContent());
     }
     
    public void EnterKey() {
        System.out.print("Press \"ENTER\" to continue...");
        try {
            System.in.read();
        } catch (IOException Enter) {
            Enter.printStackTrace();
        }    
    }
}


