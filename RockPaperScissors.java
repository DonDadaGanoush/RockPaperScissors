import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.nextLine(); 

        // if user answers yes, starts the game 
        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");

            // asks for user choice and gets computer choice using function
            // returns result of user choice and computer choice
            String userChoice = scan.nextLine();
            String compChoice = computerChoice(); 
            String result = result(userChoice,compChoice); 

            // prints result of round 
            printResult(userChoice, compChoice, result);

        } else { 
            System.out.println("Darn, some other time then!");
        }


        scan.close();
    }

    /**
     * Function name - computerChoice
     * @return choice (String)
     * 
     * Gives a random number between 1-3
     * Uses case to decide on "rock-paper-scissors" and returns choice as a String
     */
    public static String computerChoice() { 
        double randomNumber = Math.random() * 3; // range 0 - 2.999999
        int integer  = (int)randomNumber; // range: 0 - 2
        
        switch(integer) {
            case 0: return "rock"; 
            case 1: return "paper"; 
            case 2: return "scissors"; 
            default: return ""; // impossible to return anything but a string
            }
    }
    

    /**
     * Function name - result
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 
     * 
     * Uses logic And statements to determine if user wins or loses
     * If user and computer choice are the same, results in a tie
     * Returns result as a String
     *   
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) { 
            System.out.println("You win!");
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You win!");
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) { 
            System.out.println("You lose.");
        } else if (computerChoice.equals("paper") && yourChoice.equals("rock")) { 
            System.out.println("You lose.");
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) { 
            System.out.println("You lose.");
        } else { 
            System.out.println("It's a tie!");
        }
        return result;
      }
 
    /**
     * Function name - printResult
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * prints user choice and computer choice
     * displays result 
     */

     public static void printResult(String yourChoice, String computerChoice, String result) { 
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
     }
}

