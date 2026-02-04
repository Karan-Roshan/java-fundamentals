/*to fill the letter template which looks like below:
      letter = "Dear <|name|>, Wish you happy birthday"
      Replace <|name|> with a string (Some name) */

public class LetterTemplate {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Wish you happy birthday";
        letter = letter.replace("<|name|>", "Karan");
        System.out.println(letter);
    }
}