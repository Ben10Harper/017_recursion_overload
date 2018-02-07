
package pkg017_recursion_overload;

/**
 * Shows a recursive class
 * <p>
 * recursion is when a method calls itself from within its own code
 * <p>
 * @author Ben Harper
 * @version 1.0
 * @since 1.0
 */
public class StartRecursion {
    
    /**
     * main code
     * <p>
     * used to set up variables, space out the methods, and to call the recursive classes
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param args default parameter in main class
     */
    public static void main(String[] args) {
                int n = 10;
                recurse(n);
                System.out.println();
                n = 0;
                recurseUp(n);
                System.out.println();
                int startValue=0;
                int stopValue=50;
                recurseEvens(startValue, stopValue);
           
    }
    /**
     * first recursive class
     * <p>
     * this class counts down by one then calls itself again, keeps counting down until it is 0
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param n this is the number it counts down from
     */
    private static void recurse(int n) {
        
        System.out.println("recurse value is "+n+" on this recursion pass");
                n--;
                if (n>=0){
                    recurse(n);
                }
    }
    /**
     * second recursive class
     * <p>
     * this class counts up from zero by one each time it calls itself until it reaches a set number
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param n this is the number it counts up to
     */
    private static void recurseUp(int n) {
        
        System.out.println("recurseUp value is "+n+" on this recursion pass");
                n++;
                if (n<=10){
                    recurseUp(n);
                }
    }
    //overload definition: method have the same name but different parameters
    
    /**
     * last recursive class
     * <p>
     * this class also counts up to a set number, but this time it counts by 2. It is basically the same as the last, except it only prints the even numbers, even though it still counts up by ones.
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param startValue this is the number it starts counting from
     * @param stopValue this is the number it stops counting at
     */
    private static void recurseEvens(int startValue, int stopValue) {
        int t = startValue;
        if (t%2 == 0){
        System.out.println("recurseUp value is "+t+" on this recursion pass");
        }
                t++;
                if (t<stopValue){
                    recurseEvens(t, stopValue);
                }
    }
    
    
    
}// end of class
