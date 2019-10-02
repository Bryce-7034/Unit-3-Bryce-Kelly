import java.util.Scanner;

public class MinOfThree{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Please input three integers.\n");

    int input1 = scan.nextInt();
    int input2 = scan.nextInt();
    int input3 = scan.nextInt();

    if (input1 <= input2 && input1 <= input3){
      System.out.print("Minimum is " + input1);
    } else if (input2 <= input1 && input2 <= input3){
      System.out.print("Minimum is " + input2);
    } else System.out.print("Minimum is " + input3);
  }
}
