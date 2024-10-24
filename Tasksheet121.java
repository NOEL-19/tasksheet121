import static java.lang.Math.*;

public class Tasksheet121 {

    public static int add(int a, int b) {
        return addExact(a,b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        
        int a = 50;
        int b = 20;


        System.out.println("Addition of "+ a + " and "+ b + " is "+ add(a, b));
        System.out.println("Addition of "+ b + " and "+ a + " is "+ subtract(a, b));
        System.out.println("Addition of "+ a + " and "+ b + " is "+ multiply(a, b)); 
        System.out.println("Addition of "+ a + " and "+ b + " is "+ divide(a, b));




    }
}
