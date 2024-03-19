// Null Pointer Exception

public class Exception2 {
    public static void main(String[] args) {
        try {
            String s = null;  // Empty String
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("pahele s me kya hai wo toh bta re");
        }
    }
}
