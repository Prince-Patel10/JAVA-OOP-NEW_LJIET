class tc_4 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.charAt(2));
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("HELLOOOO kya aapko meri aavaj sunai de rahi hai");
        }

        try {
            String ss = "Prince";
            char c = ss.charAt(7);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Code finished");
        }
    }
}
