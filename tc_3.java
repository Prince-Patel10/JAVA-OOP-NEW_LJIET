
class tc_3 {

    public static void main(String[] args) {
        try {
            int a = 1, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            int[] array = new int[5];
            array[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
