import java.util.Scanner;

class Exec1 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String repeat = "s";

    int amountOfPeople1 = 0;
    int amountOfPeople2 = 0;
    int amountOfPeople3 = 0;
    int ageOfPeoples3 = 0;
     
    while (repeat == "s"){
      System.out.println("De 1 a 3 , qual é a sua avaliação? \n");
      switch (scanner.nextInt()) {
        case 1:
          amountOfPeople1++;

        break;
        case 2:
          amountOfPeople2++;

        break;
        case 3:
          amountOfPeople3++;
          System.out.println("Qual é a sua idade? \n");
          ageOfPeoples3 += scanner.nextInt();
        break;
        default:

        break;
      }
      System.out.println("Deseja continuar? s/n \n");

      if (scanner.next().equals("n")){
        repeat = "n";
      }
    }

     String media3 = String.valueOf((ageOfPeoples3 / amountOfPeople3));
     
     System.out.println("Média das idades das pessoas que responderam ótimo: " + media3);
     System.out.println("Quantidade de pessoas que responderam regular: " + amountOfPeople2);
     
  }
}