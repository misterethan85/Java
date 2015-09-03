
// to compile: javac-algs4 /home/ethan/Desktop/CS340/hw_1_1_7c.java 

// to run: java-algs4 hw_1_1_7c

import edu.princeton.cs.algs4.*;

public class hw_1_1_7c {

	public static void main(String[] args){

	int sum = 0;
	for (int i = 1; i < 1000; i *= 2)
		for (int j = 0; j < i; j++)
			sum++;
	{
	StdOut.println(sum);
	}
						}
			}
