package hw;
/*
 * Date: 2016/12/12
 * Author: 105021058  ¿½À·ÀM
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String n=scn.nextLine();
		int c=scn.nextInt();
		for(int i=0;i<n.length();i++){
			int a=(int)n.charAt(i);
			if(a>=65&&a<=90){
				if(a+c%26<=90){
					System.out.print((char)(a+c%26));
				}else{
					System.out.print((char)(a-25+(c%26)));
				}
			}else if(a>=97&&a<=122){
				if(a+c%26<=122){
					System.out.print((char)(a+c%26));
				}else{
					System.out.print((char)(a-26+(c%26)));
				}
			}else{
				System.out.print((char)a);
			}
		}
	}

}