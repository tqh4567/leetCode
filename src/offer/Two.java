package offer;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(15));
	}
	public static int NumberOf1(int n) {
		int num=0;
		int flag=1;
		while(flag!=0) {
			if((n&flag)!=0) {
				num++;
			}
			flag=flag<<1;
		}
		return num;
    }

}
