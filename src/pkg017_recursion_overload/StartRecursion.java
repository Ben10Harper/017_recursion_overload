
package pkg017_recursion_overload;

/**
 * 
 * <p>
 * 
 * <p>
 * @author Ben Harper
 * @version 1.0
 * @since 1.0
 */
public class StartRecursion {
    
    /**
     * 
     * <p>
     * 
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param
     * @return
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
     * 
     * <p>
     * 
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param
     * @return
     */
    private static void recurse(int n) {
        
        System.out.println("recurse value is "+n+" on this recursion pass");
                n--;
                if (n>=0){
                    recurse(n);
                }
    }
    /**
     * 
     * <p>
     * 
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param
     * @return
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
     * 
     * <p>
     * 
     * <p>
     * @author Ben Harper
     * @version 1.0
     * @since 1.0
     * @param
     * @return
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
