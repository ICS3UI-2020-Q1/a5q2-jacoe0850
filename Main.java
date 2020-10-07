import java.util.Scanner;
/**
 *
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for integer and make its variable
    System.out.println("Please enter a positive integer");
    int num = input.nextInt();
    // for loop and answers
    for(int count=1; count<num; count++){
      System.out.print(count + "," + " ");
    }
    System.out.print(num);
  }
}
