
import com.sun.security.auth.module.UnixSystem;
import interfaces.*;

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

        /*System.out.println("Digite dois números para somarmos: ");
        Scanner sc1 = new Scanner(System.in);
        double num1 = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();

        SomarInterface somar = Double::sum;
        System.out.println(somar.Somar(num1, num2));*/

        /*### 3. Texto em maiúsculas
        Lambda que receba uma `String` e devolva ela em maiúsculas.*/

        /*System.out.println("Digite um nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        TornarMaiusculoInterface str = String::toUpperCase;
        System.out.println(str.tornarMaiusculo(nome));*/

        /*### 4. Verificar se número é par
        Lambda que receba um inteiro e retorne `true` se for par, `false` caso contrário.*/

        /*System.out.print("Digite um número para verificarmos: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        VerificaParOuImparInterface n = (x) -> x % 2 == 0;
        System.out.println(n.verificaParOuImpar(num));*/

        /*### 5. Mensagem sem parâmetros
        Lambda sem parâmetros que apenas imprima `Olá, mundo!`.*/

        /*ImpressaoInterface s = () -> System.out.println("Olá mundo");
        s.imprimir();*/
    }
}