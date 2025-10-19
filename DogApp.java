public class DogApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.breed = "Labrador";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Rocky";
        dog2.breed = "German Shepherd";
        dog2.age = 4;

        dog1.bark();
        dog2.bark();
    }
}




