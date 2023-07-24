package StringAssignment;

public class StringReverse {

        public static void main(String[] args) {
            String originalString = "This method returns the reversed object on which it was called";
            StringBuffer stringBuffer = new StringBuffer(originalString);
           // StringBuffer stringBuilder = new StringBuffer(originalString);
            stringBuffer.reverse();
          //  stringBuilder.reverse();
            String reversedString = stringBuffer.toString();
          //  String reversedString = stringBuilder.toString();
            System.out.println("Original String: " + originalString);
            System.out.println("Reversed String: " + reversedString);
        }

}