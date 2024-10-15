public class Swap2numbers {
    public static void main(String[] args) {
        int a = 13, b = 9;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(b);
    }
}
