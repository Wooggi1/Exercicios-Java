
import java.util.Scanner;

class Exerc04 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite um numero: ");
      int num = scanner.nextInt();

      System.out.printf("Antecessor: %d\n", num - 1);
      System.out.printf("Sucessor: %d", num + 1);

      scanner.close();
  }
}