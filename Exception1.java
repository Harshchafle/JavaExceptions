// Arithematic Exception

public class Exception1 {
    public static void main(String args[]) {
       
        try {
            int a = 5/0;
            System.out.println("a = "+a);
           
        } catch (Exception e) {

            System.out.println("5 ko zero se divide kr rha re tu");
            System.out.println(e);
        }
    }
}
