import java.util.Scanner;

public class IntegerReader{
  public static void main(String[]args){
    int even = 0;
    int odd = 0;
    int zeros = 0;
    boolean run = true;
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter an integer");
    String input = scan.nextLine();
      for(int i = 0; i <= input.length() - 1; i++){
        String num = "-" + input.charAt(i);
        if (num.equalsIgnoreCase("-2") || num.equalsIgnoreCase("-4")
        || num.equalsIgnoreCase("-6") || num.equalsIgnoreCase("-8")){
          even++;
        } else if (num.equalsIgnoreCase("-3") || num.equalsIgnoreCase("-5")
        || num.equalsIgnoreCase("-7") || num.equalsIgnoreCase("-9") || num.equalsIgnoreCase("-1")){
          odd++;
        }else if (num.equalsIgnoreCase("-0")){
          zeros++;
      }
    }
    System.out.println("number of zeros: "+ zeros);
    System.out.println("number of evens: "+ even);
    System.out.println("number of odds: "+ odd);
  }
}
