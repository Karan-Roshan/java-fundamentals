/*write a Java program to encrypt a grade by adding 8 to it.
Decrypt it to show the correct grade*/



public class DecryptGrade {
    public static void main(String[] args) {

        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //Decrypting thr grade
        grade = (char) (grade - 8);
        System.out.println("Grade : " + grade);


    }
}
