package softwaredesign;

import java.util.Scanner;

public class Student {
    
    int id;
    String name;

    public static void main(String[] args) {
        
        
       Student s = new Student();
       Student[] list = new Student[5];
       
       Scanner in = new Scanner(System.in);
       
       for(int i=0; i < list.length - 1; i++){
           list[i] = new Student();
           System.out.print("Enter student id: ");
           list[i].id = in.nextInt();
           System.out.print("Enter student name: ");
           list[i].name = in.next();
       }
       
       for(int i = 0; i < list.length - 1; i++){
           System.out.println("name: " + list[i].name + " id: " + list[i].id);
       }
    }

}
