import javax.swing.JOptionPane;

public class function {
   
    public static void main(String[] args){
        // EXECUTANDOS AS INSTRUÇÕES
        int resultado = sum(20, 30);
        JOptionPane.showMessageDialog(null, "A soma dos valores deu " + resultado);

    }

    // CRIANDO FUNÇÕES
    static int sum(int num1, int num2){
        /*sum == nome da função
        static == carrega a função independente de valor externo
        void == quer dizer que não está retornando nada, apenas vai imprimir algo, caso queira retornar valor troque void por INT ou DOUBLE
        () == indica as instruções de varáveis que pode passar, quando quiser criar função que carregam parâmetros;
        int num1, int num2 == indica que terá dois parâmetros com valores inteiros, 
        quando utilizar no programa principal só poderão ser inteiros."*/
        return num1 + num2;
        
    }

    
}
