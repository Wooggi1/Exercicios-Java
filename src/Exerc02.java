
import java.util.Scanner;

class Exerc02{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite um numero: ");
      float X = scanner.nextFloat();

      if (X % 2 == 0) {
        System.out.println("Numero par");
      } else {
        System.out.println("Numero impar");
      }

      if (X >= 0) {
        System.out.println("Numero positivo");
        return;
      }

      System.out.println("Numero negativo");
      scanner.close();
  }
}