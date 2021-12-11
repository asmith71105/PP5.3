public class DogDriver
{
    public static void main (String[] args)
    {
        Dog dog1 = new Dog(3);
        Dog dog2 = new Dog(5);
        Dog dog3 = new Dog(12);

        System.out.println("Piper is " + dog1.compareTo(dog2) + " years younger than Fang.");
        System.out.println("Fang is " + dog2.compareTo(dog3) + " years younger than Alice.");
    }
}