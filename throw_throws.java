class throw_throws {
    static void agecheck(int age) throws ArithmeticException
    {
        if(age<18)
        {
            throw new ArithmeticException ("Not eligible");
        }
        else
            System.out.println("ELIGIBLE");
    }    
    public static void main(String[] args) {
        try {
            agecheck(10);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
