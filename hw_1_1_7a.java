
// to compile: javac-algs4 /home/ethan/Desktop/CS340/hw_1_1_7a.java 

// to run: java-algs4 hw_1_1_7a

import edu.princeton.cs.algs4.*;

public class hw_1_1_7a {

	public static void main(String[] args){

	double t = 9.0;
	while (Math.abs(t-9.0/t) > .001)
		t = (9.0/t+t)/2.0;
	{
	StdOut.printf("%.5f\n", t);
	}
						}
			}
