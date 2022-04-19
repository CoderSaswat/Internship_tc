package com.tc.training.java.prime;
public class PrimeFinder{
	public static boolean isPrime(int n){
		for(int i=2; i<n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String arg[]){
		System.out.println("prime numbers from 1 to 100 are :");
		for(int i=1; i<=100; i++){
			if(isPrime(i)){
				System.out.print(i+" ");
			}
		}
	}
}