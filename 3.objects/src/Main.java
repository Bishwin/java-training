public class Main {

    public static void main(String[] args) {

        /* we create objects like so */

        Cat cat1 = new Cat();

        /* this creates an instance of the Cat class */

        System.out.println(cat1.toString());

        /* We can create static fields that don't require instances of objects
        * useful for attributes that apply to the object as a whole not an instance */

        System.out.println("Cats belong to the " + Cat.ANIMAL_FAMILY + " family");

        /* We can call fields on an object to change the values
        * However it is bad practice to change variable directly
        * getter and setter methods should be used */

        System.out.println("My cats name is " + cat1.getName());
        cat1.setName("Oscar");
        System.out.println("My cats name is " + cat1.getName());


    }
}
