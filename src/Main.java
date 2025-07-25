
import com.sun.security.auth.module.UnixSystem;
import interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        /*### 6. Concatenar duas Strings
        Lambda que receba duas Strings e retorne uma só, separadas por espaço.*/

        /*System.out.print("Digite 2 palavras: ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        ConcatenarInterface concat = String::concat;
        System.out.println(concat.concatenar(str1, str2));*/

        /*### 7. Calcular potência
        Lambda que calcule `x` elevado a `y`.*/
        /*System.out.println("Digite 2 números para elevarmos, no caso, x ^ y");
        Scanner sc = new Scanner(System.in);
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        PotenciaInterface p = (x, y) -> {
            int z = x;
            for (int i = 0; i < y; i++) {
                x = x * z;
            }
            return x;
        };

        System.out.println(p.Potencia(num1, num2));*/

        /*### 8. Tamanho de uma String
        Lambda que receba uma String e devolva seu comprimento.*/

        /*System.out.println("Escreva uma palavra ou frase para medirmor seu tamanho, obs: Espaços contam.");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        TamanhoStringInterface t = String::length;
        System.out.println(t.tamanho(str));*/

        /*### 9. Calcular imposto
        Lambda que receba um valor e aplique 10% de imposto.*/

        /*System.out.print("Digite um valor para aplicarmos 10% de imposto: ");
        Scanner scanner = new Scanner(System.in);
        Double num = scanner.nextDouble();
        ImpostoInterface imposto = (x) -> x += x*0.1;
        System.out.println(imposto.imposto(num));*/

        /*### 10. Saudação personalizada
        Lambda que receba um nome e retorne:*/

        /*System.out.println("Digite um nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        SaudacaoInterface saudacao = (x) -> System.out.print(x + ", Parabéns");
        saudacao.saudacao(nome);*/

        /*# 🎯 Exercícios Streams (10)

        ### 1. Filtrar nomes
        De uma lista de nomes, filtre só os que começam com a letra A.*/

        /*List<String> lista = List.of("Ana", "Lucas", "Fernando", "Bianca", "América");
        List<String> listaFiltrada = lista.stream()
                .filter((nome) -> nome.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(listaFiltrada);*/

        /*### 2. Contar nomes longos
        Conte quantos nomes possuem mais de 4 letras.*/

        /*List<String> lista = List.of("Ana", "Bianca", "Fernando", "Cac");
        Integer i = lista.stream().filter((x) -> x.length() > 4).collect(Collectors.toList()).size();
        System.out.println(i);*/

        /*### 3. Transformar lista em maiúsculas
        De uma lista de Strings, retorne uma nova lista toda em maiúsculas.*/

        /*List<String> lista = List.of("Ana", "Bianca", "Fernando", "Cac");
        List<String> listaUpper = lista.stream().map(String::toUpperCase).collect(Collectors.toList());
        listaUpper.forEach(System.out::println);*/

        /*### 4. Somar números
        Some todos os valores de uma lista de inteiros.*/

        /*List<Integer> lista = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.print(lista.stream()
                .reduce(0, (a,b) -> a + b)*/

        /*### 5. Buscar o menor número
        Encontre o menor número em uma lista.*/

        /*List<Integer> lista = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(lista.stream()
                .reduce((a, b) -> a < b ? a : b));*/

        /*### 6. Buscar qualquer elemento
        Use `findAny` para pegar algum nome de uma lista.*/

        /*List<String> lista = List.of("a","b");

        Optional<String> listaFinal = lista.stream().findAny();

        System.out.println(listaFinal.get());*/

        /*### 7. Remover duplicatas
        De uma lista com nomes repetidos, retorne apenas nomes distintos.*/

        //List <String> lista = List.of("Ana", "Ana", "Bianca", "Bianca");

        /*List<String> listaSemDuplicatas = lista.stream().distinct().collect(Collectors.toList());
        System.out.println(listaSemDuplicatas);*/

        /*### 8. Limitar resultados
        Pegue apenas os 3 primeiros nomes de uma lista.*/

        /*List <String> lista = List.of("Ana", "Ana", "Bianca", "Bianca");
        List<String> listaLimitada = lista.stream().limit(3).collect(Collectors.toList());
        System.out.println(listaLimitada);*/

        /*### 9. Pular elementos
        Pule os 2 primeiros elementos e retorne o restante.*/

        /*List <String> lista = List.of("Ana", "Ana", "Bianca", "Bianca");
        List<String> listaPulada = lista.stream().skip(2).collect(Collectors.toList());
        System.out.println(listaPulada);*/

        /*### 10. Ordenar números
        Ordene uma lista de inteiros em ordem decrescente.*/

        /*List<Integer> lista = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> listaOrdernada = lista.stream().sorted((a,b) -> b - a).collect(Collectors.toList());
        System.out.println(listaOrdernada);*/
   }
}