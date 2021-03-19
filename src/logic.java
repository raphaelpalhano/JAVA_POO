import javax.swing.JOptionPane;

public class logic{
    public static void main(String[] args){
        String NOME, ENDERECO, CIDADE, ESTADO, CEP, DATANASC;
        String GRAUESC, CURSO;
        int RG;
        NOME = JOptionPane.showInputDialog("Digite seu nome: ");
        ENDERECO = JOptionPane.showInputDialog("Endereco [Rua, n.]: ");
        CIDADE = JOptionPane.showInputDialog("Cidade: ");
        ESTADO = JOptionPane.showInputDialog("Estado: ");
        CEP = JOptionPane.showInputDialog("CEP: ");
        DATANASC = JOptionPane.showInputDialog("Data de nascimento: ");
        GRAUESC = JOptionPane.showInputDialog("Grau de escolaridade: ");
        CURSO = JOptionPane.showInputDialog("Curso atual: ");
        RG = Integer.parseInt( JOptionPane.showInputDialog("RG: "));
        JOptionPane.showMessageDialog(null, "Seu nome e " + NOME + " \n" + " Voce mora atualmente na Rua " + ENDERECO + " " + CIDADE +
        " no Estado de" + ESTADO + " com CEP: " + CEP + "\n" + " Sua data de nascimento e " + DATANASC + "\n" + " O seu grau de escolaridade atual e " + GRAUESC +
        "\n" + " Voce esta cursando" + CURSO + "\n" + " Seu RG e " + RG);

        System.exit(0);
    }
}