package lianxiti;

public class Lianxi01 {
	
	public static void main(String[] args){
//��ӡ1-100������
		/*
		for(int i=1;i<=100;i++){
			System.out.println(i);}
			*/
//��ӡ1-100��ż��
		/*
		for(int i=1;i<=100;i++){
			if(i%2==0){System.out.println(i);}}
			*/
//��ӡ1-2020�������
		/*
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100!=0 || i%400==0){System.out.println(i);}}
			*/
//��ӡ1-2020�ж��ٸ�����
		/*
		int count =0;
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100!=0 || i%400==0){count++;}}System.out.println(count);
			*/
//�������1-100
		/*
		for(int i=100;i>=1;i--){System.out.println(i);}
		*/
//��ӡ1-100�ĺ�
		/*
		int s=0;
		for( int i=1;i<=100;i++){s=s+i;}System.out.println(s);
		*/
//��ӡ������*��ÿ�����*
		/*
		for(int i=1;i<=4;i++){for(int j=1;j<=5;j++){System.out.print("*");}System.out.println(" ");}
        */
//��ӡһ��5�����е�ֱ��������	
	/*
	for(int i=1;i<=5;i++){
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}System.out.println(" ");
	}
	*/
//��ӡһ���˷��ھ���		
	/*
	for(int i=1;i<=9;i++){
	for(int j=1;j<=i;j++){
		System.out.print(i+"*"+j+"="+(i*j)+" ");
	}System.out.println(" ");
	}
	*/
//��������,��ʽ1:ֱ������һ�����飬����ֵ		
	int sz[] ={10,11,12,13,14,15};
	String mz[] ={"�¸���ķ","����","�׿���","����","������ʲ"};
//����ĳ�����.length	
    int bh=mz.length;
    System.out.println(bh);
 //������±�,������±��0��ʼ,�����±�Ϊ���ֵĳ���-1	
    System.out.println(mz[0]);
    System.out.println(mz.length-1);
	
	
	
	
	
	
	
	
	
	
		
	}

}
