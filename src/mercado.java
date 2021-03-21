import javax.swing.JOptionPane;

public class mercado {
    public static void main(String[] args){
        //USANDO FOR ESTRUTURA 
        String compras[] = new String[5];
        String[] items = {"Cenouras", "Feijao", "Batata", "Arroz", "Carne"};
        for(var c = 0; c < items.length; c++){
            compras[c] = items[c];

        }
        for(var c = 0; c < compras.length; c++){
            JOptionPane.showMessageDialog(null, "Voce comprou " + compras[c]);

        }
    }
    

}
