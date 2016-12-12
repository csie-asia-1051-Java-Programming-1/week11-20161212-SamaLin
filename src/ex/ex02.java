package ex;
/*
 * Date: 2016/12/12
 * Author: 105021058  ¿½À·ÀM
 */
import java.util.Scanner;
//import java.util.ArrayList;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
//		ArrayList<Integer> list=new ArrayList<Integer>();
		while(true){
			String a=scn.nextLine();
			String data[]=a.split(" ");
//			for(int i=0;i<data.length;i++){
//				System.out.println(data[i]);
//			}
			float sum=0;
			for(int i=0;i<data.length;i++){
				sum=sum+Integer.valueOf(data[i]);
			}
//			System.out.println("Size="+sum);
			System.out.println("Size="+data.length);
			System.out.println("Average="+Math.round(sum/data.length));
		}
		
	}

}