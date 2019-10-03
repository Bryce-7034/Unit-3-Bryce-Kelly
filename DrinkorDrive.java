import java.util.Scanner;
public class DrinkorDrive{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter your age");
    int age = scan.nextInt();
    if (age >= 21 && age >= 17){
      System.out.print("you are old enough to drink and"
      +"drive, just not together\n");
    }else if (age < 21 && age >= 17){
      System.out.println("You can drive but not drink");
    }else{
      System.out.println("you can't drink or drive");
    }
  }
}
