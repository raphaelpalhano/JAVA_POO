import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<Musica>();
        Boolean continuo = true;
        while(continuo == true){
            String escolha = JOptionPane.showInputDialog("Escolha: [1, 2, 3]");
            if(escolha.equals("1")){
                for(int i= 0; i < 100; i++){
                    queeu[i] = new Musica();
                    JOptionPane.showInputDialog("Adicione algo: ");
                    queue.offer(valor);
                    String continuar = JOptionPane.showInputDialog("Quer continuar?");
                    if(continuar.equals("sim")){
                        continue;
                    }else{
                        break;
                    }
                }

            }
            else if(escolha.equals("3")){
                for(Musica elemento: queue){
                    JOptionPane.showMessageDialog(null, elemento + " " + queue.length);
                }
                
            }
            else{
                continuo = false;
            }
           
        }

    }
    
}
