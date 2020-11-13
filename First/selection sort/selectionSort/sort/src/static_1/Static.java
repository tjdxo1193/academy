package static_1;

public class Static {
	static int[] stack = {0,0,0,0,0,0,0,0,0,0};

	public static void main(String[] args) {
		System.out.println(empty(stack));
		push(stack, 5);
		push(stack, 2);
		pop(stack);
		push(stack, 4);
		System.out.println(top(stack));
		System.out.println(size(stack));
		
	}

	static void pop(int[] arg) {
		int m = -1;
		if(empty(arg)==1)
			System.out.println(m);
		else {
			m = arg[size(arg)-1];
			arg[size(arg)-1] = 0;
			System.out.println(m);
		}
	}

	static int top(int[] arg) {
		int TOP = 0;
		for (int i = arg.length - 1; i >= 0; i--) {
			if (arg[i] != 0) {
				TOP = arg[i];
				break;
			} else
				TOP = -1;
		}
		return TOP;
	}

	static void push(int[] arg, int a) {
		if (full(arg) == false) {
			for (int i = arg.length - 1; i > 0; i--)
				if (arg[i] == 0) {
					if (arg[i - 1] != 0) {
						arg[i] = a;
						break;
					}else if((i==1)&&(arg[i-1]==0))
							arg[0] = a;
				}
		} else
			System.out.println("스택이 꽉차있습니다.");

	}

	static int size(int[] arg) {
		int s = 0;
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] != 0) {
				s++;
			} else
				break;
		}

		return s;
	}

	static int empty(int[] arg) {
		if (top(arg) == -1)
			return 1;
		else
			return 0;
	}

	static boolean full(int[] arg) {
		if (arg[arg.length - 1] == 0)
			return false;
		else
			return true;
	}
}