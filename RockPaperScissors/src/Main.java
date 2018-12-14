import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean game=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Rock, Paper, Scissors.");

        int rounds=0;
        int wins=0;
        int cwins=0;
        int draws=0;

        String cont="";
        String choice ="";
       while(game==true) {
           //loops the game
           rounds++;
           do {
               System.out.println("Please choose rock, paper, or scissors.");
               choice = scan.nextLine().toLowerCase();
           } while (!(choice.equals("rock") || choice.equals("scissors") || choice.equals("paper")));

           //repeats if invalid selection from user
           System.out.println("___________________________________________");
           System.out.println("Your choice is " + choice);


           int random;
           random = (int) (Math.random() * 3);

            /*
            0 = rock
            1 = paper
            2 = scissors
             */


           // Compare player choice with computer

           if (random == 0) {
               System.out.println("Computer picks rock.");
               if (choice.equals("rock")) {
                   System.out.println("Draw");
                   draws++;
               }
               if (choice.equals("scissors")) {
                   System.out.println("You Lose");
                   cwins++;
               }
               if (choice.equals("paper")) {
                   System.out.println("You Win");
                   wins++;
               }

           }

           //Testing case with rock


           if (random == 1) {
               System.out.println("Computer picks paper.");
               if (choice.equals("rock")) {
                   System.out.println("You Lose");
                   cwins++;
               }
               if (choice.equals("scissors")) {
                   System.out.println("You Win");
                   wins++;
               }
               if (choice.equals("paper")) {
                   System.out.println("Draw");
                   draws++;
               }

           }


           //Testing case with paper

           if (random == 2) {
               System.out.println("Computer picks scissors.");
               if (choice.equals("rock")) {
                   System.out.println("You Win");
                   wins++;
               }
               if (choice.equals("scissors")) {
                   System.out.println("Draw");
                   draws++;
               }
               if (choice.equals("paper")) {
                   System.out.println("You Lose");
                   cwins++;
               }
           }
           //Testing case with scissors
           System.out.println("___________________________________________");
           System.out.println("Current round: " + rounds);
           System.out.println("Your win points: " + wins);
           System.out.println("Computer win points: " +cwins);
           System.out.println("Draws: " + draws);
           System.out.println("___________________________________________");
            //shows the scores


               System.out.println("Would you like to continue (yes or no) or reset the score?");

           do {
               cont = scan.nextLine().toLowerCase();
           } while (!(cont.equals("yes") || cont.equals("no") || cont.equals("reset") ));
           if (cont.equals("no")){
               game=false;
               System.out.println("Game Over");
           }
           else if(cont.equals("reset")){
               rounds=0;
               wins=0;
               cwins=0;
               draws=0;
               System.out.println("Game Reset");
               //resets or stops the game
           }

       }


}
}
