

public class MultipleCatch1 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[5] = 30/0;
        } catch(ArithmeticException e){
            System.out.println("Arithematic Exception Occured");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception Occured");
        } catch(Exception e){
            System.out.println("Exception Occured");
        }

        System.out.println("Ho gya EXception");
    }
}
