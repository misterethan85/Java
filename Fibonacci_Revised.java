
//to Compile: javac-algs4 /home/ethan/Desktop/CS340/Fibonacci_Revised.java 
//to Execute: java-algs4 Fibonacci_Revised

import edu.princeton.cs.algs4.*;

	public class Fibonacci_Revised
        {

        public static long F(int N)
        {

        if (N==0) return 0;
        if (N==1) return 1;
        return F(N-1) + F(N-2);

        }

        public static void main(String[] args)

        {
                for (int N=0; N < 90; N++)
                        StdOut.println(N+""+F(N));
        }
}

