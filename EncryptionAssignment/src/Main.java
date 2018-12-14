import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean translator = true;
        Scanner scan = new Scanner(System.in);
        String choice = "";
        String eword = "";
        String tword = "";
        String cont = "";

        System.out.println("I will translate your English word to another dialect.");

        while (translator == true) {

                System.out.println("What is your word?");
                eword = scan.nextLine();
            String lastLetter = eword.substring(eword.length() - 1);
            tword = lastLetter + eword.substring(0, eword.length() - 1) + "ay";
            System.out.println("It is: " + tword);
//puts last letter of the word to the front while adding "ay" at the end
            do {
                System.out.println("Would you like me to translate it back to English?");
                choice = scan.nextLine().toLowerCase();
            } while (!((choice.equals("yes") || (choice.equals("no")))));
//choice of translating the dialect back to English
            if (choice.equals("yes")) {
                String firstLetter = tword.substring(0, 1);
                eword = tword.substring(1, tword.length() - 2) + firstLetter;
                System.out.println("It is: " + eword);
//removes the last two letters (ay) from the word and adds the first letter to the end
            }

            System.out.println("Would you like to try another word? (yes or no)");

            do {
                cont = scan.nextLine().toLowerCase();
            } while (!(cont.equals("yes") || cont.equals("no")));
            if (cont.equals("no")) {
                translator = false;
                System.out.println("Ending Translator");
            }
//ends translator or continues to use
        }
    }
}


