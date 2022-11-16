public class Main {
    public static void main(String[] args) {
        System.out.println("Primitive Types Challenge");

        byte myByteValue = 123;
        short myShortValue = 23467;
        int myIntValue = 345678901;
        long sumOfByte = myByteValue + myShortValue + myIntValue;
        long myLongValue = 50000 +(10 * sumOfByte);

        System.out.println("myLongValue: " + myLongValue);

    }
}