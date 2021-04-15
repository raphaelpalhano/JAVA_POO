public class Calculate {
    public static void main(String[] args){
        if(args[0].equals("soma")){
           var num1 = Integer.parseInt(args[1]);
           var num2 = Integer.parseInt(args[2]);
           var somando = sum(num1, num2);
            System.out.println(somando);
        }
        else if (args[0].equals("multiplicar")){
           var multiplicando = multiplication(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
           System.out.println(multiplicando);
        }else if(args[0].equals("subtrair")){
            var subtraindo = subtraction(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(subtraindo);

        }
      

    }


    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    
    public static int subtraction(int num1, int num2){
        if(num1 > num2){
            return num1 - num2;
        }else{
            return num2 - num1;
        }

    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;

    }
    
}
