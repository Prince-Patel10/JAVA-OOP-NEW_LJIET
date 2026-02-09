class polymorphism_Run {
    void car()
    {
        System.out.println("White Rolls Royce");
    }
}
class polymorphism_Run_1 extends polymorphism_Run
{
    void car()
    {
        super.car();
        System.out.println("Sky Blue Rolls Royce");
    }
    public static void main(String[] args) {
        polymorphism_Run_1 ob = new polymorphism_Run_1();
        ob.car();
    }
}