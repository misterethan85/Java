
// to compile: javac-algs4 /home/ethan/Desktop/CS340/hw_1_1_12.java 

// to run: java-algs4 hw_1_1_12

import edu.princeton.cs.algs4.*;

public class hw_1_1_12 {

	public static void main(String[] args){

	int[] a = new int[10];
	for (int i = 0; i < 10; i ++)
		a[i] = 9 - i;
	for (int i = 0; i < 10; i ++)
		a[i] = a[a[i]];
	for (int i = 0; i < 10; i ++)
	{
		System.out.println(a[i]);
	}
						}
			}
