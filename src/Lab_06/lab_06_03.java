package Lab_06;

public class lab_06_03 {
    public static void main(String[] args) {
       String myString = "12345nabc678";
       String numString = "";
        char[] strArr = myString.toCharArray();
        for (char character : strArr) {
            if (Character.isDigit(character)) {
                numString = numString + character;
            }
        }
        System.out.println("Result is: "+ numString);
    }
}
