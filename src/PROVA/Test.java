import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args){
        String listagem[] = new String[10];
        for(int i = 0; i<=5; i++){
            listagem[i] = JOptionPane.showInputDialog("Nome: ");
        }
        for(String elemento : listagem){
            System.out.println(elemento);
        }
    }
    
}
