import java.util.Scanner;

public class Multiples{
  public static void main(String[]args){
    int max = 0;
    int multiple = 0;
    final int MAX_ROWS = 5;
    Scanner scan = new Scanner(System.in);
    do {
      System.out.println("Please input the max output number");
      if (scan.hasNextInt()) max = scan.nextInt();
      else continue;
      System.out.println("Please input the integer you want the multiples of");
      if (scan.hasNextInt()) multiple = scan.nextInt();
      else continue;
      if (max < multiple) System.out.print("Max must be greater than"
      +" or equal to multiple\n");
      if (max <= 0) System.out.println("Max cannot be less than or equal to 0");
      if (multiple < 0) System.out.println("Multiple cannot be less than 0");
      if (multiple == 0) System.out.println("A multiple of 0 is 0");
    } while (max < multiple || max <= 0 || multiple <= 0);
    for (int i = 0; max >= (multiple * i); i++){
      for (int rows = 1; rows <= MAX_ROWS && max >= multiple*i; rows++){
        System.out.print((multiple * i) +" ");
        i++;
      }
      System.out.print("\n");
    }
  }
}
