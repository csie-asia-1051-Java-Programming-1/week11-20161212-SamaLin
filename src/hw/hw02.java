package hw;

/*
 * Date: 2016/12/12
 * Author: 105021058  ¿½À·ÀM
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while (true) {
			int sum = 1;
			boolean flag = false;
			String data[] = scn.nextLine().split(" ");
			for (int i = 0; i < data.length - 1; i++) {
				for (int j = i + 1; j < data.length; j++) {
					String ram = "";
					if (Integer.valueOf(data[i]) > Integer.valueOf(data[j])) {
						ram = data[i];
						data[i] = data[j];
						data[j] = ram;
					}
				}
			}
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i].equals(data[i + 1])) {
					sum = sum + 1;
				} else {
					sum = 1;
				}
				if (sum > data.length / 2) {
					System.out.println(data[i]);
					break;
				} else if (i == data.length - 2) {
					System.out.println("NO");
				}
			}
		}
		// if(flag==true){}
	}

}