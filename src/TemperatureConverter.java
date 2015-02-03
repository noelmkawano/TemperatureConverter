import java.util.Scanner;

/**
 * Created by NOEL on 2/2/2015.
 */

public class TemperatureConverter {
  public static void main(String[] args){
    double celsius, fahrenheit;

    System.out.print("Enter Temperature Unit");
    Scanner scan = new Scanner(System.in);
    String temp =scan.nextLine();

    if(temp.equals("-C")){
      System.out.print("Enter Unit Value");
      Scanner in = new Scanner(System.in);
      if (in.hasNextInt()) {
        int value = in.nextInt();
        fahrenheit=(value*9/5)+32;
        System.out.print(fahrenheit);
        return;
      }
      else{
        System.out.print("Illegal Second Argument");
        return;
      }
    }
    if(temp.equals("-F")){
      System.out.print("Enter Unit Value");
      Scanner in = new Scanner(System.in);
      if(in.hasNextInt()){
        int value = in.nextInt();
        celsius=(value-32)*5/9;
        System.out.print(celsius);
        return;
      }
      else{
        System.out.print("Illegal Second Argument");
        return;
      }
    }
    else{
      System.out.print("Illegal first argument");
      return;
    }
  }
}
