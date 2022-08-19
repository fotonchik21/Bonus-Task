public class Task2 {

    public static void main(String[] args) {
        int countClient = 100;
        int refillAmount = 1001;
        int bonus = 0;
        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
            countClient = countClient + bonus + refillAmount;
        } else {
            countClient = countClient + refillAmount;
        }
        System.out.println("Текущий счет составляет " + countClient + ", количество бонусных рублей составляет " + bonus);
    }
}
