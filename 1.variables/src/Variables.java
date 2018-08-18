public class Variables {

    public static void main(String[] args) {

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        int minInteger = Integer.MIN_VALUE;
        int maxInteger = Integer.MAX_VALUE;

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        char letters = 'a'; // note single quotes

        boolean myBoolean = true;

        // We can print this to the terminal with System.out.println("message here")

        System.out.println("The following variables are called primitive types");

        System.out.println("Bytes can hold values " + minByte +" to " + maxByte );
        System.out.println("Short can hold values " + minShort +" to " + maxShort );
        System.out.println("Integers can hold values " + minInteger +" to " + maxInteger );
        System.out.println("Long can hold values " + minLong +" to " + maxLong );
        System.out.println("Float can hold values " + minFloat +" to " + maxFloat );
        System.out.println("Double can hold values " + minDouble +" to " + maxDouble );
        System.out.println("Char is for characters = " + letters);
        System.out.println("Booleans store true or false = " + myBoolean + "\n");

        System.out.println("We can print this to the terminal with System.out.println(\"message here\")");
        System.out.println("System.out.println includes a carriage return, so additional statements appear on new lines ");
        System.out.print("whereas System.out.print doesn't and prints messages on the same line ");
        System.out.println("#### MY NEW LINE!#####");
    }
}
