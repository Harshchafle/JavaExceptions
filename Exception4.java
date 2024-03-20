// Array Index Out of Bound Exception

public class Exception4 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try{
            arr[6] = 10;
           System.out.println();
        } catch(Exception e){
            System.out.println("jitni chadar hai utne hi pair faila le");
        }
    }
}
