package powerset;

public class Power_Set {

	public static void main(String[] args) {

		int[] p = {1, 5, 9};
		PowerSet(p);

	}

	public static void PowerSet(int arg[]) {
		int b = arg.length - 1;
		if (b >= 0) {
			int[] parg = new int[b];
			int pos = 0;
			for (int i = 0; i < arg.length; i++) {
				pos = 0;
				for (int j = 0; j < arg.length; j++) {
					if (pos != i) {
						parg[pos] = arg[j];
						pos++;
					}else {
						if(j != arg.length -1) {
							parg[pos] = arg[j+1];
							pos++;
							j++;
						}
					}
				}
				PowerSet(parg);
			}
			System.out.print("{");
			for (int k = 0; k < arg.length; k++)
				System.out.print(arg[k]+",");
			System.out.print("} ");
		
		}
	
	
	}
}
