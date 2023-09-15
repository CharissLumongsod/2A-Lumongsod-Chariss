import java.util.Scanner;

class Flower{
     private String type;
     private String color;
     
     //setter 
        protected void setType (String type)  {
                this.type= type;
        }
        protected void setColor(String color){
           this.color = color; 
            }
            
         // getter
         protected String getType(){
            return this.type;
      }
         protected  String getColor(){
             return this.color;
             }
   }
   
   //MAIN
   
   public class Main{
       public static void main (String []args){
       Scanner scan = new Scanner (System.in);
       
       Flower flowers = new Flower();
       
       System.out.print(" Enter the type of the flower:  ");
       String userInput = scan.nextLine();
       
       flowers.setType( userInput);
       
       System.out.println(" You entered :  " + flowers.getType());
       
       
              System.out.print(" Enter the color of the flower:  ");
       String userInput2 = scan.nextLine();
       
       flowers.setColor( userInput2);
       
       System.out.println(" You entered :  " + flowers.getColor());
       
       scan.close();
       
       }
       }
