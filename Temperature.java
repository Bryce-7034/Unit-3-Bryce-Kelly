import java.util.Scanner;

public class Temperature{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter the temperature and a message will be shown");
    int temp = scan.nextInt();
    if (temp>83){
      System.out.println("hot");
    }else if (temp >= 68 && temp<=83){
      System.out.println("ideal");
    }else if (temp >= 45 && temp <=67){
      System.out.println("cool");
    }else{
      System.out.println("cold");
    }
  }
}
