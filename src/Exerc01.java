
import java.util.Scanner;

class Exerc01{
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o Valor de A: ");
    int A = scanner.nextInt();

    System.out.println("Digite o valor de B: ");
    int B = scanner.nextInt();

    System.out.println("Digite o valor de C ");
    int C = scanner.nextInt();

    int soma = A + B;

    System.out.println("A soma de A + B = " + soma);
    if (soma < C){
      System.out.println("Soma menor que C");
    } else {
      System.out.println("Soma maior que C");
    }

    scanner.close();
  }
}