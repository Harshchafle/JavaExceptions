// Number  format Exception

public class Exception3 {
    public static void main(String[] args) {
        String s = "abc";
        int i;
        try {
            i = Integer.parseInt(s);
            System.out.println(i);
        } catch(Exception e) {
            System.out.println("String should be number to conver it to type number");
        } 
    }
}
