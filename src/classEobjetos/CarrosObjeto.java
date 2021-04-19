public class CarrosObjeto {
    public static void main(String[] args){
        Carros cliente1 = new Carros();

        cliente1.comprarcarro("camaro amarelo");
        System.out.println(cliente1.verificarcarro());
        cliente1.comprarcarro("limusine");
        cliente1.listacarro();
    }
    
}
