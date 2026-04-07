class gc2<T>{

   public static <T> void display(T a){
       System.out.println(a);
   }

    public static void main(String[] args) {
        display("DAX");
        display(1);
        display(1.56);

    }
}