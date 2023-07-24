package StringAssignment;

public class StringBufferAppend {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("StringBuffer");
        stringBuffer.append(" is a peer class of String");
        stringBuffer.append(" that provides much of \"the functionality of strings\"");
        String result = stringBuffer.toString();
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StringBuilder");
        stringBuilder.append(" is a peer class of String");
        stringBuilder.append(" that provides much of \"the functionality of strings\"");
        String result2= stringBuilder.toString();
        System.out.println(result2);
    }
}