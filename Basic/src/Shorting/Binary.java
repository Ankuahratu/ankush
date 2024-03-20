package Shorting;

import java.util.Scanner;

public class Binary {
	 public static int dis(int[]num,int key) {
		 int l=num[0];
		 int h=(num.length-1); 
		 while(l<=h) {
			int mid=(l+h)/2;
	     if(num[mid]==key) {
	    	 return mid;
	     }else if(num[mid]>key) {
	    	   h=mid-1;
	     }else {
	    	  l=mid+1;
	     }
			 
		 }
		 return -1;
	 }
public static void main(String[] args) {
//	int[] num= {1,2,3,4,5,6,7};
	
	Scanner sc=new Scanner(System.in);
	System.out.println("size");
	int n=sc.nextInt();
	System.out.println("elements");
	
	int[] num=new int[n];
		for(int i=0;i<=n-1;i++) {
		num[i]=sc.nextInt();
	}
		System.out.println("Enter key");
		int key=sc.nextInt();
		System.out.println("index of key is=");
		System.out.println(dis(num,key));
	
}
}
