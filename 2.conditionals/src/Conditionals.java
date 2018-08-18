public class Conditionals {

    public static void main(String[] args) {

        System.out.println("Conditionals in java");

        int myAge = 22;
        final int LEGAL_DRINKING_AGE = 18; //

        if (myAge >= LEGAL_DRINKING_AGE){
            System.out.println("I'm allowed to drink");
        }
        else {
            System.out.println("I'm not allowed to drink");
        }

        int myBrothersAge = 23;

        if (myBrothersAge >= LEGAL_DRINKING_AGE){
            System.out.println("My brother is allowed to drink");
        }
        else {
            System.out.println("My brother is allowed to drink");
        }


        System.out.println("Switches are fancy conditionals \n");

        String food_type = "carnivore";

        switch (food_type) {
            case "carnivore":
                System.out.println("Eats animals");
                break;
            case "herbivore":
                System.out.println("Eats plants");
                break;
            case "omnivore":
                System.out.println("Eats plants and animals");
                break;
        }

        int Age = 12;
        switch (Age) {
            case 12:
                System.out.println("I can see films rated 12");
            case 17:
                System.out.println("I can learn to drive");
            case 18:
                System.out.println("Allowed to Drink");
            case 21:
                System.out.println("I can drink in America");
        }

    }
}
