package money;

import java.util.Scanner;

public class TienVietNam {
//hyghhjggg
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("nhap so tien");
		/*int amount = input.nextInt();

		int soTo500 = amount / 500;
		amount = amount % 500;

		int soTo200 = amount / 200;
		amount = amount % 200;

		int soTo100 = amount / 100;
		amount = amount % 100;*/
		Tien t = new Tien();
		t.amount=input.nextInt();
		t.so500=t.amount/500;
		t.amount %= 500;
		
		t.so200=t.amount/200;
		t.amount %= 500;
		
		t.so100=t.amount/100;
		t.amount %= 100;

		System.out.println("So to 500 la: " + t.so500);
		if (t.so200 > 0) {

			System.out.println("So to 200 la: " + t.so200);
		}
		System.out.println("So to 100 la: " + t.so100);
	}

}
