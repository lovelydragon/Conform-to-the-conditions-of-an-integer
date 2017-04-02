
public class Main {
	public static void main(String[] args){
		int N = 123;
		long M =0;
		long product;
		for(int i=1;;i++){
			product  = binarytodecimalism(i);
			if(product%N==0){//不使用M是否为整数作为判断			
				M = product/N;
				break;
			}
		}
		System.out.println(M);
	}
	public static long binarytodecimalism(int n){
		long result;
		String str = Integer.toBinaryString(n);
		result = Long.parseLong(str);
		return result;
	}
}
