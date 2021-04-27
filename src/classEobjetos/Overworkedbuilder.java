public class Overworkedbuilder{
    private String name;
    private int age;
    private String surname;

    public Overworkedbuilder(){
        name = "";
        surname = "";
        age = 0;

    }

    public Overworkedbuilder(String sname, String surnamem, int agen){
        name = sname;
        surname = surnamem;
        age = agen;
        

    }

    public void modificateNames(String sname, String surnan){
        name = sname;
        surname = surnan;

    }

    public String showfullName(){
        return name + " " + surname;
    }

    public void modificateAge(int sage){
        age = sage;

    }

    public int showAge(){
        return age;

    }

}