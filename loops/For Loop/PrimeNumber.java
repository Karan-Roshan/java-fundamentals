//print prime number between 1 to 100

public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            {
                int count = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                    else
                        continue;

                }
                if (count == 1)
                    System.out.println(i);
            }

        }
    }
}
