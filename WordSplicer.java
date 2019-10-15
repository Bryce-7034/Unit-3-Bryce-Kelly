// We should play heads-up 7-up
import java.util.Scanner;

public class WordSplicer{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("please type a string to be split");
    String input = scan.nextLine();
    for (int i = 0; i < input.length(); i++){
      char oneLetter = input.charAt(i);
      System.out.print(oneLetter +" \n");
    }
  }
}
