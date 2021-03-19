import javax.swing.JOptionPane;

public class media {
    public static void main(String[] args){
        // valor da média 
        var media = 7.0;
        // primeira nota do aluno
        var nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota "));
        //segunda nota
        var nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota "));
        // cálculo da média
        var valor = (nota1 + nota2)/2;
        // estrutura condicional
        if (valor < media){
            JOptionPane.showMessageDialog(null, "Voce tirou, " + valor + ". Voce esta reprovado!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Voce tirou, " + valor + ". Voce esta aprovado!");
        }

    }
    
}
