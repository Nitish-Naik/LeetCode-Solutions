public class fibonacci
{
    static int fibo_recr(int n)
    {
        if(n == 0 || n == 1) return n;
        int fibn = fibo_recr(n-1) + fibo_recr(n-2);
        return fibn;
    }
    static int fibo_iter(int n)
    {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for(int i=1; i<n; i++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            
        }
        return n3;
    }

        public static int[] generateFibonacciSeries(int N) {
            int[] fibonacciSeries = new int[N];
            fibonacciSeries[0] = 0;
            fibonacciSeries[1] = 1;
    
            for (int i = 2; i < N; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }
    
            return fibonacciSeries;
        }
    
        public static void main(String[] args) {
            int N = 10; // Replace with your desired value
            int[] result = generateFibonacciSeries(N);
    
            // Print the result
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    // }
    
    // public static void main(String[] args) 
    // {
    //     System.out.println(fibo_recr(9));
    //     System.out.println(fibo_iter(9));
    // }
}
