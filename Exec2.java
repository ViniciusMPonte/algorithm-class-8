import java.util.Scanner;
import java.util.Random;

class Exec2 {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numRandom = random.nextInt(11);
    int attempts = 2;
     
    System.out.println("Tente adivinhar o número sorteado de 0 a 10: ");

    for(int i = 0; i <= attempts; i++){

      int num = scanner.nextInt();

      if (num == numRandom){
        System.out.println("Você acertou!");
        break;
      } else if(i < attempts) {
        System.out.println("Você errou!");
        if(num > numRandom){
          System.out.println("O número sorteado é menor que " + num);
        } else {
          System.out.println("O número sorteado é maior que " + num);
        }
        System.out.println("Tente novamente!");
        
      }else if(i == attempts){
        System.out.println("Você perdeu!");
      }
    }   
  } 
}