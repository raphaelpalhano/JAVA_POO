public class objectoverworked {
    public static void main(String[] args){
        Overworkedbuilder overowork = new Overworkedbuilder("João", "Carlos", 22);
    
        System.out.println(overowork.showfullName());

        Overworkedbuilder overon = new Overworkedbuilder();
        overon.modificateNames("Juano", "Cebaro");
        overon.modificateAge(19);
        System.out.println(overon.showfullName());
    }
    
}

