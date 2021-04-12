import javax.swing.JOptionPane;

public class potencia{
    public static void main(String[] args){
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Exponente: "));
        int fator = Integer.parseInt(JOptionPane.showInputDialog("Fator: "));
        // fator * 2
        potenciacao(fator, exponente);
    }
    
    public static void potenciacao(int fat, int exponente){
       int i = 0;
       int valor = fat;
       while(i < exponente){
           valor *= fat;
           i++;

       }
       JOptionPane.showMessageDialog(null, "O fator e " + fat + " o exponente e " + exponente + " resultando em: " + valor);
    }
}
