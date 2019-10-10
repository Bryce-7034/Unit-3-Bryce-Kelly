import java.util.Scanner;

public class WinPercentage{
  public static void main(String[]args){

    Scanner scan = new Scanner(System.in);
    System.out.println("please enter the number of games played");
    double played = scan.nextDouble();
    System.out.println("now enter the number of games won");
    double won = scan.nextDouble();
    //sets all the errors
    while (played <= 0 || won < 0 || won > played ||
    won != Math.round(won) || played != Math.round(played)){
      if (won != Math.round(won)){
        System.out.println("Your games won must be an integer");
      } else if (played != Math.round(played)){
        System.out.println("Your games played must be an integer");
      } else if (played <= 0){
        System.out.println("games played needs to be greater than zero");
      } else if (won < 0){
        System.out.println("games won must be equal or greater than zero");
      } else if (won > played){
        System.out.println("games won must be less than games played");
      }
      System.out.println("please re-enter your values");
      System.out.println("Played:");
      played = scan.nextInt();
      System.out.println("Won:");
      won = scan.nextInt();
    }
    double percentage = (won / played) * 100;
    System.out.println("your win percentage is "+ percentage + "%");
  }
}
