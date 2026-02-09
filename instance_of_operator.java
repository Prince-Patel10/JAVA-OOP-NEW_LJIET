class instance_of_operator {
    public static void main(String[] args) {
        instance_of_operator a = new instance_of_operator();
        if(a instanceof instance_of_operator)
            System.out.println("a is instance of Class");
        else
            System.out.println("a is not instance of Class");
    }
}
