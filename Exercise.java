
public class Exercise {
    
      static void checkresult(String name, int marks){
          if(marks>=50)
          {
              System.out.println("passed");
          }
          else
          {
              System.out.println("failed");
          }
      }
    
    public static void main(String[]args){
        
        String name="Waleed";
        int marks=55;
        int age=22;
        
        System.out.println("student details");
        System.out.println("name:"+name);
        System.out.println("marks:"+marks);
        System.out.println("age:"+age);
        checkresult(name,marks);
     }
    }
