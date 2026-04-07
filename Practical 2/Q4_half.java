interface Function
{
    int evaluate(int n);
}
class Q4_half implements Function {
    public int evaluate(int n)
    {
        return n/2;
    }
    public static void main(String[] args) {
        Q4_half o = new Q4_half();
        System.out.println(o.evaluate(6));
    }
}
