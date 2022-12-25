public class Animal {

    public Animal(String name,String type){
        this.name=name;
        this.type=type;
    }
    String name;
    String type;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal animal=new Animal("Mia","Cat");
        System.out.println(animal);
    }
}
