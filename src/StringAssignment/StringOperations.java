package StringAssignment;

public class StringOperations {
    public static void main(String[] args) {
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        String lowercaseStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowercaseStr);
        String uppercaseStr = str.toUpperCase();
        System.out.println("Uppercase String: " + uppercaseStr);
        String replacedStr = str.replace('a', '$');
        System.out.println("Replaced String: " + replacedStr);
        boolean containsCollection = str.contains("collection");
        System.out.println("Contains collection: " + containsCollection);
        String testString = "Java string pool refers to collection of strings which are stored in heap memory";
        boolean stringsMatch = str.equals(testString);
        System.out.println("Strings Match: " + stringsMatch);
        boolean stringsEqual = str.equalsIgnoreCase(testString);
        System.out.println("Strings are Equal " + stringsEqual);
    }
}