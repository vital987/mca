public class Assignment4 {
    public static void main(String[] args) {
        Integer intValue = 10;
        Float floatValue = 25.5f;
        String stringValue = "Government College of Engineering";

        int intValueAsPrimitive = intValue.intValue();
        System.out.println("Converted int value: " + intValueAsPrimitive);

        double doubleValue = floatValue.doubleValue();
        System.out.println("Converted float value to double: " + doubleValue);

        int length = stringValue.length();
        System.out.println("Length of the string: " + length);

        String upperCaseString = stringValue.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        String substring = stringValue.substring(7);
        System.out.println("Substring starting from index 7: " + substring);
    }
}

/* OUTPUT
Converted int value: 10
Converted float value to double: 25.5
Length of the string: 33
Uppercase string: GOVERNMENT COLLEGE OF ENGINEERING
Substring starting from index 7: ent College of Engineering
*/