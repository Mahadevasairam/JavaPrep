public class PrimitiveTypeChallenge {
    public static void main(String[] args) {
        int a = 20;
        short b = 1;
        byte c = 2;
        long d = 1000 * (a+b+c);
        System.out.println(d);

        short e = (short) (1000 * (a+b+c));
        System.out.println(e);
    }
}
