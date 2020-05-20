
public class ExceptionTest {
    public static void main(String[] arg) {
    	int x = 10, y = 0, z;
    	try {
    		z = x / y;
    	} catch(Exception e) {
    		System.out.println("Exception");
    	} catch(ArithmeticException e) {
    		System.out.println("ArithmeticException");
    	}
    }
}