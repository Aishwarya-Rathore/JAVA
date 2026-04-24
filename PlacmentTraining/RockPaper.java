import java.util.*;

public class RockPaper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int i = 1;
        int me = 0;
        int you = 0;

      do{
        System.out.println("Enter your choice: 0 for Rock, 1 for Paper, 2 for Scissor");
        int choice = sc.nextInt();

        if (choice > 2 || choice < 0) {
            System.out.println("Invalid choice...");
            sc.close();
            return;
        }

        int computerChoice = rand.nextInt(3);
        String[] choices = {"Rock", "Paper", "Scissor"};

        System.out.println("Your choice: " + choices[choice]);
        System.out.println("Computer's choice: " + choices[computerChoice]);

        if (choice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((choice == 0 && computerChoice == 2) ||
                   (choice == 1 && computerChoice == 0) ||
                   (choice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
            me++;
        } else {
            System.out.println("Computer wins!");
            you++;
        }
        i++;
      }while(i<=3);


    System.out.print("Final Result is : ");
      if(me>you){
        System.out.print("You win..!!");
      }
      else if(me<you){
        System.out.print("Computer wins..!!");
      }
      else{
        System.out.println("Draw..!!!");
      }

        sc.close();
    }
}