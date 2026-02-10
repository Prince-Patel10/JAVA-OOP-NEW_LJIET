class Q_7
{
	int length;
	int widht;
	Q_7()
	{
		length = 0;
		widht = 0;
	}
	public int getarea()
	{
		int area = length*widht;
		return area;
	}
	public static void main(String[] args)
	{
		Q_7 ob = new Q_7();
		System.out.println(ob.getarea());
	}
}