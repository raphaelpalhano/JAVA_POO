import java.util.Scanner;

import javax.swing.JOptionPane;

public class functions1 {
    public static void main(String[] args){
        // CRIANDO A instância
        Scanner input = new Scanner(System.in);

        int valor1;
        System.out.printf("Digite um valor: ");
        valor1 = input.nextInt();
        fibonaci(valor1);
        input.close();
        
    }


    public static void fibonaci(int valor1){
        int x = 0;
        int c = 0;
        while(x <= valor1){
            if(x == 0){
                x++;
            }else{
                System.out.println(x);
                x = x + c;
                c = x - c;
            }          

        }
    }

  
    
}
