import java.util.Scanner;

public class somatorio {
    public void somaConjunto(){
        Scanner input = new Scanner(System.in);
        int n, num, soma= 0, i=0;
        System.out.println("Quantos numeros vc quer somar?");
        n = input.nextInt();
        while (i<n){
            i = i+1;
            System.out.println("Diga o "+ i+ " numero!");
            num = input.nextInt();
            soma = soma +num;

        }
        System.out.println("A soma e: " + soma);
    }
}
