//Sum of Odd number from 1 to 20

public class SumOfOddNumber {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1; i<=20; i++) {
            if(i%2!=0) {
                sum+=i;
            }
            else {
                continue;
            }
        }
        System.out.println("Sum of Odd Number: "+sum);
    }
}
