public class objeto1 {
    public static void main(String[] args){
        Class1 cliente1 = new Class1();
        cliente1.inserindoNome("Juca");
        cliente1.gerarConta(20.35);
        System.out.printf("O Cliente " + cliente1.gerarNome()  + " comprou um frango e vai pagar " +  cliente1.mostrarConta());

    }
    
}
