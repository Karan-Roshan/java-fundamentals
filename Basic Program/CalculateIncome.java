import java.util.Scanner;

public class CalculateIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary : "); 
        int salary = sc.nextInt();

        if(salary>1000000) {
            int tax = (salary * 30)/100;
            System.out.println("Tax amount : "+ tax);
        }
        else if(salary>500000 && salary<=1000000) {
            int tax = (salary * 20)/100;
            System.out.println("Tax amount : "+ tax);
        }
        else if(salary>250000 && salary<=500000) {
            int tax = (salary * 10)/100;
            System.out.println("Tax amount : "+ tax);
        }
        else {
            System.out.println("No Tax");
        }
        

    }
}
