//sum of even number from 1 to 20

public class SumOfEvenNumber1 {
    public static void main(String[] args) {
        int sum=0;

        for(int i=0; i<=20; i=i+2) {
            sum+=i;
        }
        System.out.println("Sum of Even Number: "+sum);
    }
}
