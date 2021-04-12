public class Class1 {
    private String nomecliente;
    private double precolanche;

    public Class1(){
        nomecliente = "";
        precolanche = 0;
        

    }

    public void inserindoNome(String nome){
        nomecliente = nome;

    }

    public String gerarNome(){
        return nomecliente;
    }

    public void gerarConta(double preco){
        precolanche = preco;
    }

    public double mostrarConta(){
        return precolanche;
    }
    
}
