import java.util.Scanner;

public class PalendromeTester{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    boolean palendrome = true;
    String y = "y";
    String n ="n";
    String revInput = "";
    System.out.println("would you like to enter a palendrome, (y/n)");
    String enter = scan.nextLine();
    if (enter.equalsIgnoreCase(y)){
      while (palendrome){
        while (enter.equalsIgnoreCase(y)){
            System.out.println("please enter a Palendrome to be tested");
            String input = scan.nextLine();
            input = input.replaceAll("[^a-zA-Z ]", "");
            input = input.replaceAll(" ", "");
            revInput = "";
            for(int i = input.length() - 1; i >= 0; i--){
              revInput = revInput + input.charAt(i);
            } if (input.equalsIgnoreCase(revInput)){
              System.out.println("this is a Palendrome");
            } else{
              System.out.println("This is not a Palendrome, "+ revInput +" Would be.");
            }
            System.out.println("would you like to enter another palendrome, (y/n)");
            enter = scan.nextLine();
          }
          if (enter.equalsIgnoreCase(n)){
            System.out.println("Thank you for giving me use");
            palendrome = false;
          } else{
            System.out.println("That is not n or y");
            System.out.println("Would you like to try again? try y or n");
            enter = scan.nextLine();
          }
        }
      } else if (enter.equalsIgnoreCase(n)){
        System.out.println("Why did you even run me then.");
      } else{
        System.out.println("That is not n or y");
        System.out.println("Would you like to try again? try y or n");
        enter = scan.nextLine();
      }
  }
}
