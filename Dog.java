public class Dog {

    private String breed;
    private String name;
    private int age;

    public Dog(String d_breed) {
        breed = d_breed;
    }

    public Dog(String d_name, int d_age) {
        name = d_name;
        age = d_age;
    }

    public void bark() {
        System.out.println("Dog's Bark");
    }

    // get the breed of the dog
    public String getBreed() {
        return breed;
    }

    // get the name of the dog
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog myDog1 = new Dog("German Shepherd");
        myDog1.bark();
        Dog myDog2 = new Dog("Tommy", 7);
        myDog2.bark();
        System.out.println("Breed of Dog is: " + myDog1.getBreed());
        System.out.println("Name of Dog and Age respectively: " + myDog2.getName() + " and " + myDog2.getAge());
    }
}
