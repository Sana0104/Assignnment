package StringAssignment;

public class InsertText {

        public static void main(String[] args) {
            String originalString = "it is used to at the specified index position";
            String insertion = "insert text";
            int index = originalString.indexOf("the");
            if (index != -1) {
                StringBuilder stringBuilder = new StringBuilder(originalString);
                stringBuilder.insert(index, insertion);
                String result = stringBuilder.toString();
                System.out.println(result);
            } else {
                System.out.println("The specified location for insertion does not exist.");
            }
        }
    }

