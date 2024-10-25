import java.util.Scanner;

class Exec3 {
   public static void main(String[] args){

    int positiveNumbers = 0;
    int negativenumbers = 0;
    int input = 0;

    System.out.println("Digite 10 números positivos e negativos:");
    for(int i = 1; i <= 10; i++){
      System.out.println("Número " + i + ": ");
      input = new Scanner(System.in).nextInt();
      if(input > 0){
         positiveNumbers++;
      } else if(input < 0) {
         negativenumbers++;
      }     
    }
     System.out.println("Quantidade de números positivos: " + positiveNumbers);
     System.out.println("Quantidade de números negativos: " + negativenumbers);
    
   } 
}