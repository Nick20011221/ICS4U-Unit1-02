import java.util.Scanner;

/**
 * This program calculates how many logs of a certain measurment a truck can hold.
 * Class Logs
 * 
 * @author Nick P-A
 * @since 2020/2/13 feb 13 2020
 * @version 1.0
 */
 
 
public class Logs {
  static double lengthOfLogs;
  static double weight;
  static int numberOfLogs;
  
  
  /**
  * This class calculates the number of logs a truck can carry depending on the length of the logs.
  */
  
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("How long are the logs? 0.25, 0.5, or 1 metre?: ");
    lengthOfLogs = userInput.nextDouble();
    weight =  lengthOfLogs * 20;
    numberOfLogs =  1100 / (int) weight;
    System.out.println("The truck can carry " + numberOfLogs + " logs that are " 
        + lengthOfLogs + "m long.");
  }
}
