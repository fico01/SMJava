import java.util.Scanner;

public class SM {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        int salario = scam.nextInt();

        int sm = salario/788;

        System.out.println("O seu salario equivale a " + Math.round(sm) + " salario(s) minimos");
    }
}
