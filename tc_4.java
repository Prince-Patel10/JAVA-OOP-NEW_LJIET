class tc_4 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.charAt(2));
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("HELLOOOO kya aapko meri aavaj sunai de rahi hai");
        }
    }
}
