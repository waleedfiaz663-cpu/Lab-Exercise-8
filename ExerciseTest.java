public class ExerciseTest {
    
    String Name;
    int marks;
    int age;
    
   
    void checkresults()
    {
        if(marks>=50)
        {
            System.out.println("passed");
        }
            
        else
        {
            System.out.println("failed");
        }
    }
    
     void displaydetails()
    {
        System.out.println("student details");
        
        System.out.println("Name:"+Name);
        
        System.out.println("marks:"+marks);
        
        System.out.println("age:"+age);
    }
     
        public static void main(String[]args)
        {
            ExerciseTest s1=new ExerciseTest();
            
            s1.Name="Waleed";
            s1.marks=77;
            s1.age=22;
            
            s1.displaydetails();
            s1.checkresults();
            
        }  
    
    }
