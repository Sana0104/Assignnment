package BasicDataStructure;


import java.util.HashMap;
import java.util.Scanner;

public class CUI {
    public static void main(String[] args) {
        HashMap<String,String> validusers=new HashMap<>();
        validusers.put("sana","sana123");
        validusers.put("minnu","minnu123");
        Scanner sc=new Scanner(System.in);
        int maxattempts=3;
        int attempts=0;
        while(attempts<maxattempts){
            System.out.print("Enter login name");
            String username=sc.nextLine();
            System.out.print("Enter your password");
            String password=sc.nextLine();
            if(validusers.containsKey(username)&&validusers.get(username).equals(password)){
                System.out.println("Welcome"+username);
                break;
            }else {
                attempts++;
                System.out.println("Invalid userid or password"+(maxattempts-attempts));

            }
        }
        if(attempts==maxattempts){
            System.out.println("Max attempts");
        }
        sc.close();
    }
}
