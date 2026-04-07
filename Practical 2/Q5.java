public class Q5 {
    int x,y;
   public static int power(int x,int y)
  {
    int result=1;
    for(int i=1;i<=y;i++)
    {
      result=result*x;
    }
    return result;
  }
    
    public static void main(String[] args){
      int x = Integer.parseInt(args[0]);
      int y = Integer.parseInt(args[1]);
      int result = power(x, y);
        
     try {
          if(y<0)
              {
                System.out.println("Exponent cannot be negative");
              }
          else
              System.out.println(x+" power "+y+" = "+result);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
}