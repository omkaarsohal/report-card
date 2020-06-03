import java.io.*;
import java.util.Scanner;

public class Student {
    public int age;
    public int grade;
    public String name;
    public int math;
    public int ELA;
    public int science;
    public int history;
    public int spanish;
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Student omkaar = new Student();
        
        
        System.out.print("Enter your math grade: ");
        omkaar.math = scan.nextInt();
        System.out.print("Enter your ELA grade: ");
        omkaar.ELA = scan.nextInt();  
        System.out.print("Enter your science grade: ");
        omkaar.science = scan.nextInt();
        System.out.print("Enter your history grade: ");
        omkaar.history = scan.nextInt();
        System.out.print("Enter your spanish grade: ");
        omkaar.spanish = scan.nextInt();
        
        omkaar.age = 13;
        omkaar.grade = 8;
        omkaar.name = "Omkaar";
        
        print(omkaar);
        scan.close();
    }
    
    public static void print(Student om) {
        
        System.out.println(om.name);
        System.out.println("Grade " + om.grade);
        System.out.println(om.age + " years old");
        
        System.out.println("math grade: " + om.math);
        System.out.println("ELA grade: " + om.ELA);
        System.out.println("science grade: " + om.science);
        System.out.println("history grade: " + om.history);
        System.out.println("spanish grade: " + om.spanish);
        int average = (om.math + om.history + om.science + om.ELA)/4; 
        System.out.println("average Grade: " + average);
    }
}





