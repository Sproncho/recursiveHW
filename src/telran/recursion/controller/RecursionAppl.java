package telran.recursion.controller;

import java.util.stream.StreamSupport;

public class RecursionAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cgd(15,12));

	}
	
	public static int cgd(int a, int b) {
		if(b == 0){
			return a;
		}
		return cgd(b,a%b);
	}
	
	public static double sqrt(double a,double x, double precision) {
		double res = (a / x + x) / 2;
		if(Math.abs(res - a) < precision)
			return res;
		else return sqrt(a,res,precision);

	}
	
	public static void print100() {
		//TODO print to console numbers from 1 to 100. Don't use loops and choice operators

	}

}
