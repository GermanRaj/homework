

public class Main {
    public static void main(String[] args) {
        int intNumber = 10000;
        byte byteNumber = 20;
        double double_number = 3225525.33;
        float floatNumber = 532252.25F;

        int extensionOfByteToInt = byteNumber;
        System.out.println("Extension byte to int " +extensionOfByteToInt);

        byte constrictionIntToByte = (byte)intNumber;
        System.out.println("Constriction int to byte " +constrictionIntToByte);

        double extensionOfFloatToDouble =floatNumber;
        System.out.println("Extension float to double " +extensionOfFloatToDouble);

        float constrictionOfDoubletoFloat = (float) double_number;
        System.out.println("Constriction double to float " +constrictionOfDoubletoFloat);







    }
}
