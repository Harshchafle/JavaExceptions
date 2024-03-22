public class MyNewException1 extends Exception {
    MyNewException1(String msg){
        super(msg);
    }

    public static void main(String[] args) {
        int i=15;
        int j=0;
        try{
            if(i==15){
                throw new MyNewException1("Hey this is user defined Exception");
            }
            int result = i + j;
            System.out.println("Addition is "+result);
        } catch(MyNewException1 e){
            System.out.println("inside catch of MyNewException");
            System.out.println(e);
        } catch(ArithmeticException e){
            System.out.println("Arithematic Exception ka catch ");
        } finally{
            System.out.println("Finally Ends");
        }
    }
}
