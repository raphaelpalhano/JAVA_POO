public class newFunctions {
    public static void main(String[] args){
        
        // Função para verificar o menor número:
        System.out.println(LowerNumber(40, 20)); // <<<< Esses são os argumentos, vão dentro dos colchentes como uma forma de indicar que a função está recebendo os valores
        

        // Função que vai verificar o maior número: 
       System.out.println(BiggerNumber(1213, 12132)); 

    }

    public static int LowerNumber(int num1, int num2){
        var menor = 0;
        if(num1 < num2){
            menor = num1;
        }else{
            menor = num2;
            
        }
        
        return menor;

    }

    public static int BiggerNumber(int numero1, int numero2){
        var maior = 0;
        if(numero1 > numero2){
            maior = numero1;
        }else{
            maior = numero2;
        }

        return maior;
    }

    
}
