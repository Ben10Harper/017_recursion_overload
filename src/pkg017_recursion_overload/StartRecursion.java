
package pkg017_recursion_overload;

/**
 *
 * @author Ben Harper
 */
public class StartRecursion {
    
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

    private static void recurse(int n) {
        
        System.out.println("recurse value is "+n+" on this recursion pass");
                n--;
                if (n>=0){
                    recurse(n);
                }
    }
    
    private static void recurseUp(int n) {
        
        System.out.println("recurseUp value is "+n+" on this recursion pass");
                n++;
                if (n<=10){
                    recurseUp(n);
                }
    }
    //overload definition: method have the same name but different parameters
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
