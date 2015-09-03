
// to compile: javac-algs4 /home/ethan/Desktop/CS340/hw_1_1_6.java 

// to run: java-algs4 hw_1_1_6

import edu.princeton.cs.algs4.*;


public class hw_1_1_6 {


	public static void main(String[] args){

	int f = 0;
	int g = 1;

	for (int i = 0; i <= 15; i++)
	{
		StdOut.println(f);
		f = f + g;
		g = f - g;
		}
	}
}
