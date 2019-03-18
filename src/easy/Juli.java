package easy;

public class Juli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(1,4));
	}public static int hammingDistance(int x, int y) {
        if(x<0|y<0){
            return 0;
        }
        int bitCount = Integer.bitCount(x^y);
        return bitCount;
       
    }

}
