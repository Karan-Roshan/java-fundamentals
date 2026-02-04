import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Website Url : "); //also write . in the url
        String url = sc.nextLine();

        switch (url) {
            case ".com":
                System.out.println("Commercial Website");
                break;
            case ".org":
                System.out.println("Organization Website");
                break;
            case ".in":
                System.out.println("Indian Website");
                break;
            default:
                System.out.println("Enter Valid Website");
                break;
        }

    }
}
