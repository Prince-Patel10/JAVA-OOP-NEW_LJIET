class encapsulation {
    private int id;

    public void setId(int i)
    {
        id = i;
    }
    public int getId()
    {
        return id;
    }
}
class encapsulation1
{
    public static void main(String[] args) {
        encapsulation ob = new encapsulation();
        ob.setId(1);
        System.out.println(ob.getId());
    }
}
