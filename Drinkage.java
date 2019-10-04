import java.util.Scanner;

public class Drinkage{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter your age");
    int age = scan.nextInt();
    if(age >= 21){
      System.out.println("you are old enough to drink");
    }else{
      System.out.println("you are not old enough to drink");
    }
  }
}
