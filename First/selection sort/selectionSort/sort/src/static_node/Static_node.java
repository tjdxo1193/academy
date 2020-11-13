package static_node;

public class Static_node {

	public static void main(String[] args) {
		diagonal(5);
	}
	public static void Mabangzin(int N) {
		// 수 증가 할때 행 1 증가 열 1 감소
		// N의 배수일때 행 x 열 1 증가
		// 배열을 넘어갈때 행이  벗어날때는 윗 열에 가장 작은 행 , 열이 벗어날때 다음 행에 가장 큰 열에 
		int row=0, col;
		int mid = N/2;
		col = mid;
		int[][] arg = new int[N][N];
		for(int i = 1; i <= N*N; i++) {
			arg[row][col] = i;
			if(i%N==0) {
				row++;
			}else {
				row--;
				col++;
				if(row < 0) row = N-1;
				if(col>N-1) col = 0;
			}
		
		}
		for(int j = 0; j < N; j++ ) {
			for(int k =0; k<N; k++) {
				System.out.print(arg[j][k]+" ");
			}
			System.out.println();
		}
	}
	
	public static void diagonal(int N) {
		int tric =1;
		int row=0, col=0;
		int round=0;
		int[][] arg = new int[N][N];
		for(int i = 1; i <= N*N; i++) {
			
			if((round < N-1)&&(row < 0)) {
				round++;
				row = round;
				col = 0;
			}else if((round > N-1)&&(row < tric)){
				row = N-1;
				col = tric+1;
				tric++;
				round++;
			}
			else if((round==N-1)&&(row < 0)) {
				row = round;
				col = tric;
				round++;

			}
			arg[col][row] = i;
			System.out.print(arg[col][row]+" ");
			row--;
			col++;
			
		}
		for(int j = 0; j < N; j++ ) {
			for(int k =0; k<N; k++) {
				System.out.print(arg[j][k]+" ");
			}
			System.out.println();
		}

	}
}



