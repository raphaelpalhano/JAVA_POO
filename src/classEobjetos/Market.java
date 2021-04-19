import javax.swing.JOptionPane;

public class Market {

    private String fruits[];
    private String homemadefood[];
    private double prices[];

    public Market(){
        fruits = new String[] {"apple", "orange", "mango", "grape", "watermelon"};
        homemadefood = new String[] {"rice", "bean", "noodle", "beef", "fish"};
        prices = new double[]  {5.45, 6.25, 4.55, 8.75, 9.35, 12.15, 15.30, 11.10, 22.50, 18.50};
    }

    public void showMerchandise(){
           var choice = JOptionPane.showInputDialog("Choose the Merchandise: [fruits, homemadefood]: ");
           if(choice.equalsIgnoreCase("fruits")){
               for(int i = 0; i <= fruits.length; i++){
                JOptionPane.showMessageDialog(null, "Our Fruits are: " + fruits[i]);

                }
            }

            else if(choice.equalsIgnoreCase("homemadefood")){
                for(int i = 0; i <= homemadefood.length; i++){
                JOptionPane.showMessageDialog(null, "Our homemadefood are: " + homemadefood[i]);

                }        
            }             
    
    
    }


     

}