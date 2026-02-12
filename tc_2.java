class tc_2 {
    public static void main(String[] args) {
        try {
            int [] array = new int[5];
            array[6]=10;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
