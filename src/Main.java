
import interfaces.DobrarInterfaces;
import interfaces.SomarInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*### 1. Dobro
        Crie uma lambda que receba um número inteiro e devolva o dobro.*/

        /*System.out.println("Digite um número para dobrarmos: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        DobrarInterfaces dobrar = (x) -> x * 2;
        System.out.println(dobrar.Dobrar(N));*/

        /*### 2. Somar dois números
        Escreva uma lambda que receba dois inteiros e retorne a soma.*/

        System.out.println("Digite dois números para somarmos: ");
        Scanner sc1 = new Scanner(System.in);
        double num1 = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();

        SomarInterface somar = Double::sum;
        System.out.println(somar.Somar(num1, num2));
    }
}