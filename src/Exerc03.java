
import java.util.Scanner;

class Exerc03 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.err.println("Digite um numero: ");
      int x = scanner.nextInt();

      System.err.println("Digite o segundo numero: ");
      int y = scanner.nextInt();

      if (x == y) {
        System.out.printf("Soma: %d", x + y);
      }

      scanner.close();
  }
}