import javax.swing.JOptionPane;

public class estructure {
    public static void main(String[] args){
        var idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));

        if (idade > 1 && idade  < 12){
            JOptionPane.showMessageDialog(null, "Nossa, voce tem " + idade + " anos de idade, voce e uma crianca!");
        } else if (idade > 12 && idade < 18){
            JOptionPane.showMessageDialog(null, "Voce tem " + idade + " anos" + " voce e um adolescente!");
        }
        else if (idade > 18 && idade < 29){
            JOptionPane.showMessageDialog(null, "Hmm... "  + idade + " anos de idade " + " esta em sua juventude!");
        }
        else if (idade > 29 && idade < 60){
            JOptionPane.showMessageDialog(null, "Vixi... " + " voce tem" + idade + " anos de idade" + " esta na fase adulta!");

        }
        else{
            JOptionPane.showMessageDialog(null, " " + " voce tem " + idade + " anos de idade, ja e um idoso, cuidado!");

        }
        System.exit(0);
    }
    
}
