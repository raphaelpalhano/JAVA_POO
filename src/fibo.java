public class fibo {
    public static void main(String[] args){
        int x = 0;
        int c = 0;
        int i = 0;
        int valor1 = 10;
        while(x <= valor1){
            if(x == 0){
                x++;
            }else{
                System.out.print(x);
                x = x + c;
                c = x - c;
                i++;
            }
            

        }
    }
    
}
