package easy;

public class LeeCode605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] flowerbed= {1,0,0,0,1,0,1};
		int n=1;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int zero=0;
		if(n<1) {
			return true;
		}
		int[] help=new int[flowerbed.length+2];
		help[0]=0;
		for(int i=0;i<flowerbed.length;i++) {
			help[i+1]=flowerbed[i];
		}
		help[flowerbed.length+1]=0;
		
		for(int j=0;j<help.length-2;j++) {
			if(help[j]!=1&&help[j+1]!=1&&help[j+2]!=1) {
        		zero+=1;
        	}
		}
        	if(n>zero) {
        		return false;
        	}else {
        		 return true;
        	}
       
    }

}
