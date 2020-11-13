package binerysearch;

public class BinerySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 5, 6, 7, 8, 9, 20, 30, 40 };
		binerySearch(a, 8);
	}

	public static void binerySearch(int[] arg, int N) {
		int Start= 0;
		int End = arg.length-1;
		
		while(End >= Start) {
			int Mid = ((Start + End) / 2); 
			if(arg[Mid] == N) {
				System.out.println(N + "의 인덱스 번호는 : " + Mid);
				break;
			}
			if(arg[Mid] > N) {
				End = Mid - 1;
			}else{
				Start = Mid - 1;
			}

		}
		
	}

}
