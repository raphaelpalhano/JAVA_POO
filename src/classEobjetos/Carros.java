import java.util.ArrayList;
import java.util.List;

public class Carros{
    private List<String> veiculos = new ArrayList<>();
    private String meucarro;

    public Carros(){
        meucarro = "";
    }

    public void comprarcarro(String ncarro){
        meucarro = ncarro;
        veiculos.add(meucarro);

    }

    public String verificarcarro(){
        return meucarro;
    }

    public void listacarro(){
        System.out.println(veiculos);
        
    }


}