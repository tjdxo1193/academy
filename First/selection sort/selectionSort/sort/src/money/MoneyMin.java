package money;
import java.util.Scanner;
public class MoneyMin {
	public static void main(String[] args) {
		System.out.println(Money_Min(5, 6800));
	}
	public static int Money_Min(int kind, int money) {
		int min = 0;
		int re = money;//³²Àºµ·
		Scanner scan = new Scanner(System.in);
		int[] Money_k = new int[kind];
		for(int i = 0; i <Money_k.length; i++) {
			Money_k[i] = scan.nextInt();
		}
		for(int k = kind-1; (k >= 0) && (re != 0); k--) {
			if(re > Money_k[k]) {
				min += re / Money_k[k];
				re = re % Money_k[k];
			}
		}
		return min;
	}
}