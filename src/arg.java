public class arg {
    public static void main(String[] args){
        System.out.println("Primeiro " + args[0]);
        System.out.println("Segundo " + args[1]);
        System.out.println("Terceiro " + args[2].charAt(3));

        switch(10){
            case 5:
                System.out.println("Burro");
            break;
            case 15:
                System.out.println("Errou");
                break;
            default:
                System.out.println("NADA");
        }
    }
    
}
