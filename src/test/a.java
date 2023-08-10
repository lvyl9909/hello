package test;

public class a {
    public static long Factorial(int m) {
		if (m == 1 || m == 0) 
	    	return 1;
		return m * Factorial(m - 1);
    }
    
    public static int EuclideanAlgorithm(int x, int y) {
		if (x < y) {
	    	int temp = x;
	    	x = y;
	    	y = temp;
		}
        if (y == 0)
            return x;
        int remainder = x % y;
        return EuclideanAlgorithm(y, remainder);
    }
}
