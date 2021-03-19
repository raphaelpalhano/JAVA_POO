import javax.swing.JOptionPane;

public class alunos {
    public static void main(String[] args){
        String Nome;
        int NumAluno;
        NumAluno = 1;
        String alunos[] = new String[10]; 

        while (NumAluno <= 5){
            Nome = JOptionPane.showInputDialog("Digite seu nome: ");
            JOptionPane.showMessageDialog(null, "Aluno cadastrado: " + Nome);
            alunos[NumAluno] = Nome;
            NumAluno++;
        }
        
        for (var i=1; i < alunos.length; i++){
        
        JOptionPane.showMessageDialog(null, "Os alunos cadastrados sao: " +  alunos[i]);

        }
        System.exit(0);
    }
    
    
}
