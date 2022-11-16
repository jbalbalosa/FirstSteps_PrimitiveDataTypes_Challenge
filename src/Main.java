public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Primitive Types Challenge");

        /*
        Your challege is to create a byte variable and set it to any valid byte number,
        it doesn't matter. Create a short variable and set it to any valid short number.

        Create an int variable and set it to any valid int number.
        Lastly, create a variable of type Long and make ir equal to 50000
        plus 10 times the sum of Byte plus the Short plus the Integer values
         */

        byte myByteValue = 123;
        short myShortValue = 23467;
        int myIntValue = 345678901;
        long sumOfByte = myByteValue + myShortValue + myIntValue;
        long myLongValue = (50000 + 10 ) * sumOfByte;

        System.out.println("myLongValue: " + myLongValue);

    }
}