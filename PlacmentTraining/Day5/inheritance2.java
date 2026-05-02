class Dadaji{
    String name;
    int age;
    String surname;
    Dadaji(String name, int age,String surname){
        this.name = name;
        this.age = age;
        this.surname = surname;
    }
    void working(){
        System.out.println("Social Work!!!");
    }
}
class Papa extends Dadaji{
   String business;
   Papa(String name, int age,String surname, String business){
    super(name,age,surname);
    this.business = business;
   }
}

public class inheritance2 {
    public static void main(String[] args) {
        Papa p = new Papa("Deepak",46,"Rathore","WholeSale_Shope");
        p.working();
    
    }
}