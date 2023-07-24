package BasicDataStructure;
import java.util.Scanner;

public class Tax {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your gender (Male/Female): ");
            String gender = scanner.nextLine();

            System.out.print("Are you a Senior Citizen? (yes/no): ");
            String isSeniorCitizenInput = scanner.nextLine();
            boolean isSeniorCitizen = isSeniorCitizenInput.equalsIgnoreCase("yes");

            System.out.print("Enter your CTC (Cost to Company): ");
            double ctc = scanner.nextDouble();

            double taxAmount = calculateIncomeTax(gender, isSeniorCitizen, ctc);
            System.out.println("Income Tax amount: " + taxAmount);

            scanner.close();
        }

        public static double calculateIncomeTax(String gender, boolean isSeniorCitizen, double ctc) {
            double taxAmount = 0.0;

            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                if (ctc <= 180000) {
                    taxAmount = 0;
                } else if (ctc <= 300000) {
                    taxAmount = ctc * 0.1;
                } else if (ctc <= 500000) {
                    taxAmount = ctc * 0.2;
                } else if (ctc <= 1000000) {
                    taxAmount = ctc * 0.3;
                }
            } else if (isSeniorCitizen) {
                if (ctc <= 300000) {
                    taxAmount = 0;
                }else if (ctc <= 500000) {
                    taxAmount = ctc * 0.2;
                } else if (ctc <= 1000000) {
                    taxAmount = ctc * 0.3;
                }
            }

            return taxAmount;
        }

}