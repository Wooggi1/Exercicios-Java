
import java.util.Scanner;

class Exerc03 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.err.println("Digite um numero: ");
      int x = scanner.nextInt();

      System.err.println("Digite o segundo numero: ");
      int y = scanner.nextInt();

      int resultado;
      if (x == y) {
        resultado = x + y;
      } else {
        resultado = x * y;
      }

      System.out.printf("Resultado: %d", resultado);

      scanner.close();
  }
}