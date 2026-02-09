class polymorphism_compile {
    int addition(int a, int b)
    {
        return a + b ;
    }
    int addition(int a, int b, int c)
    {
        return a + b + c ;
    }
    public static void main(String[] args) {
        polymorphism_compile ob = new polymorphism_compile();
        System.out.println(ob.addition(5, 6));
        System.out.println(ob.addition(5, 6,7));
    }
}
