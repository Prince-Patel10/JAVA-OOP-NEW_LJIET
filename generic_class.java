public class generic_class <t> {
    t a;
    void setdata(t a)
    {
        this.a=a;
    }
    t getdata()
    {
        return a; 
    }
    public static void main(String[] args) {
        generic_class <Integer> g = new generic_class<>();
        g.setdata(1);
        System.out.println(g.getdata());
        generic_class <String> g1 = new generic_class<>();
        g1.setdata("BROWN TOWN");
        System.out.println(g1.getdata());
    }
}
