package easy;

public class CSDN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,5,2}; 
		int[] b=new int[10]; 
		for(int i=0;i<a.length;i++){
			b[a[i]]++; 
		} 
		int max=b[0]; //�������
		int value=0; //�������ֵ 
		for(int i=1;i<b.length;i++){ 
			if(b[i]>max){ 
				max=b[i];
				value=i; 
			} 
		} 
		System.out.print("���ִ�������ֵ��:"+value+", ������"+max+"��");
		
	}

}
