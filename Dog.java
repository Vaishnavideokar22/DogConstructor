class DogMethod{
    String name;
    String breed;
DogMethod(String Name,String Breed){
    this.name = Name;
    this.breed = Breed;
}
}
public class Dog {

    public static void main(String[] args) {
        
        DogMethod d1 = new DogMethod("Rockey", "");
        System.out.println(d1.name);
        System.out.println(d1.breed);

        DogMethod d2 = new DogMethod("Bella"," ");
        System.out.println(d2.name);
        System.out.println(d2.breed);
    }
    
}
