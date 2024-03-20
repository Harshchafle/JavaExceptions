public class finally1 {
    public static void main(String[] args) {
        int i=0,j=1;
        int arr[] = new int[3];
        try{
            // j=17/i;
            arr[5]=3;
            System.out.println("j="+j);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception ouccured");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } catch(ArithmeticException e){
            System.out.println("Arithematic Exception occured");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Exception occured");
            System.out.println(e.getMessage());
        } finally{
            System.out.println("program ends here ");
        }
    }
}
