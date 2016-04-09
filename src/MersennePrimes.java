import java.util.Scanner;

public class MersennePrimes {
  public static void main(String[] args){
    System.out.println("P                  2^p-1");
    System.out.println("---------------------------");
    
    for (int i = 2; i <= 31; i++){
      if (Mersenne(i) != 0)
        System.out.printf("%-5d" + "              " + "%-1d\n", i, Mersenne(i));
    } // for i
  } // main
  
  public static boolean Prime(int num){
    for (int divisor = 2; divisor <= num / 2; divisor++) {
      if (num % divisor == 0) { // If true, number is not prime
        return false; 
      } // if
    } // for  
    
    return true;
  } // Prime
  
  public static int Mersenne(int p){
    int mersenne = ((int) Math.pow(2, p)) - 1;
    if (Prime(mersenne))
       return mersenne;
    return 0;
  } // Mersenne
}
