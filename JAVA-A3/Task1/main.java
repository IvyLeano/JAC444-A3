public class main {
    public static void main(String[] args) {
        Complex x = new Complex(3.5, 5.5);
        System.out.print(x.add(-3.5, 1));
        System.out.print(x.subtract(-3.5, 1));
        System.out.print(x.multiply(-3.5, 1));
        System.out.print(x.abs(3.5, 5.5));
        System.out.print(x.divide(-3.5, 1));
    }
}