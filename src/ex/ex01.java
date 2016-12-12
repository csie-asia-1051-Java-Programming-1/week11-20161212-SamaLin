package ex;
/*
 * Date: 2016/12/12
 * Author: 105021058  ¿½À·ÀM
 */
import java.util.Scanner;
//import java.util.Collections;
public class ex01 {
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int an[]=new int[n];
		for(int i=0;i<n;i++){
			int T=scn.nextInt();
			int m=scn.nextInt();
			int k=scn.nextInt();
			int sum=0,ram=0;
			int data[]=new int[k];
			for(int j=0;j<k;j++){
				data[j]=scn.nextInt();
			}
//			Collections.sort(data);
			
			for(int a=0;a<k-1;a++){
				for(int b=a+1;b<k;b++){
					if(data[a]>data[b]){
						ram=data[a];
						data[a]=data[b];
						data[b]=ram;
					}
				}
			}
			
			for(int j=0;j<m;j++){
				sum=sum+data[j];
			}
			if(sum<=T){
				an[i]=sum;
			}else{
				an[i]=0;
			}
		}
		for(int i=0;i<n;i++){
			if(an[i]>0){
				System.out.println(an[i]);
			}else{
				System.out.println("Impossible");
			}
		}
	}
}