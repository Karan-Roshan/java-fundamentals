// name = String
// age = byte
// salary = int

import java.util.*;

public class PersonDetails {
    public static void main(String[] argu) {
        String name;
        byte age;
        int salary;
        Scanner Sc = new Scanner (System.in);

       System.out.print("Enter name: ");
       name = Sc.nextLine();

       System.out.print("Enter age: ");
       age = Sc.nextByte();

       System.out.print("Enter salary: ");
       salary = Sc.nextInt();

       System.out.println("Name = "+name);
       System.out.println("Age = "+age);
       System.out.println("Salary = "+salary);
     }
}
