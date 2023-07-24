public class Operators {
    public static void main(String[] args){
        String carModel="Challenger 67";
        int price=56789;
        int moneyInTheBank=34567890;
        boolean isDamaged=true;

        System.out.println("price"+carModel+"$ "+price);
        String DamagedTest=isDamaged?"car damaged":"car isn't damaged";
        System.out.println(DamagedTest);
    }
}
