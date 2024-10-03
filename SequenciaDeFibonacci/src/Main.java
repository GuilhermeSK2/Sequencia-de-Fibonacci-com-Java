import java.util.Scanner;

public class Main {
    /*
        A sequência de Fibonacci é uma sequência infinita onde cada número é a soma
        dos dois anteriores, normalmente começando com 0 e 1.
        Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
        Foi descrita por Leonardo Fibonacci em 1202 para modelar o crescimento de
         uma população de coelhos.
    */

    public static void main(String[] args){
        System.out.println("Vamos realizar uma sucessão Fibonacci!");
        System.out.println("Digite um número para determinar o limite da sucessão:");
        Scanner input = new Scanner(System.in);

        int f1 = 0;
        int f2 = 1;
        int limit = input.nextInt();

        while(f2 < limit){
            int fn = f1 + f2;
            if (fn > limit)
                break;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }
}
