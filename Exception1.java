// Arithematic Exception

public class Exception1 {
    public static void main(String args[]) {
       
        try {
            int a = 5/0;  // This Statement causes the Arithematic Exception which is subclass of Exception Class
            System.out.println("a = "+a);
           
        } catch (Exception e) {   // Handling the Exception With the catch Block ( we can use perfect catch like ArithematicException e)

            System.out.println("5 ko zero se divide kr rha re tu");
            System.out.println(e.getMessage());
        }
    }
}
