public class gc1 <t> {
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
        generic_class <Float> g = new generic_class<>();
        g.setdata((float) 1.01);
        System.out.println(g.getdata());
        generic_class <String> g1 = new generic_class<>();
        g1.setdata("BROWN TOWN");
        System.out.println(g1.getdata());
        generic_class <Double> g2 = new generic_class<>();
        g2.setdata(2.34);
        System.out.println(g2.getdata());
        generic_class <Character> g3 = new generic_class<>();
        g3.setdata('B');
        System.out.println(g3.getdata());
    }
}
