package recursion.tree;

/**
 * Print N to 1 by backtracking
 * Time complexity: O(N)
 * Space complexity: O(N)
 */
public class Print_N_to_1_By_BackTracking {

    public static void print (int iteration, int n) {
        if (iteration > n) {
            return;
        }
        print(iteration + 1, n);
        System.out.println(iteration); //printing after function call
    }

    public static void main (String[] args) {
        print(1, 3);
    }
}
