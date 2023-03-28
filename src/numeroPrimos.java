import java.util.Scanner;

public class numeroPrimos {
    static boolean verificarPrimo(int numero){
        for (int i=2; i< numero; i++){
            if(numero % i == 0){
                return false;

            }
        }
        return true;
    }
    public void numeroPrimo(){
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero!!");
        numero = input.nextInt();
        if(verificarPrimo(numero)==true){
            System.out.println("é um número primo.");
        }else {
            System.out.println("não é um número primo.");
        }
    }
}
