class label
{
    public static void main(String[] args) 
    {
        System.out.println("Label Break");
        outer :
        for(int i=0; i<=3; i++)
        {
            for(int j=0; j<=3; j++)
            {
                if(i==2 && j==2)
                    break outer;
                System.out.println(i+" "+j);
            }
        }

         System.out.println("Label Continue");
        upper:
        for(int i=0; i<=3; i++)
        {
            for(int j=0; j<=3; j++)
            {
                if(i==2 && j==2)
                    continue upper;
                System.out.println(i+" "+j);
            }
        }
    }
}