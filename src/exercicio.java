import java.util.Scanner;


public class exercicio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int valor1 = input.nextInt();

        
        System.out.println("Digite outro numero: ");
        int valor2 = input.nextInt();

        int resultado = soma(valor1, valor2);
        imprimir(resultado);


    }

    public static int soma(int v1, int v2){
        return v1 + v2;
    }
    
    public static void imprimir(int valor){
        System.out.print("A soma dos valores resultou em " + valor);
    }
}
