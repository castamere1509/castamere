package org.chengcai.day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1�����һ����������������ε���������������ɺ���main�����е��á�
 * 2�����һ�������������������ε��ܳ������������ɺ���main�����е��á�
 * 3�����һ�������������㳤�������������������ɺ���main�����е��á�
 * 4�����һ�����������������������͵����飬�ܹ�������Ӵ�С�������򡣲�����main�����е��á�
 * 5�����һ�����������ΪͶ�ҽ�����Ͷ��50��100���ͳ�ֵ�����޳�ֵ50��100��
 *            ���ݲ�ͬ��Ͷ�Һͳ�ֵ�����ز�ͬ�Ľ�������������ɺ���main�����е��á�
 * 7�����һ���ɼ��ж�����������main�����е���
 * 8�����һ�������ж������û��ڿ���̨������ݣ��������� ������/�������� ��������main�����е���
 * 9�����һ��nn�˷��ھ���ӡ�� ,�û��ڿ���̨���� n��ֵ ,��ӡ����Ӧ�Ľ����������main�����е���
 * 10�����һ�����������ж������Ƿ���ϱ�׼��
 * �������ʱӦ�ÿ��ǵ��� 
 * 1��������ͨ�õģ��߼�����ȷ�ģ�������©�߼���
 * 2������Ӧ�ô���ʲô���ݣ�����ʲô���ݡ�
 *
 * 
 */
public class Functionlianxi {
	//1�����һ����������������ε���������������ɺ���main�����е��á�
	public static double mj(double a,double b){
		double c=a*b;
		return c;
	}
   //2�����һ�������������������ε��ܳ������������ɺ���main�����е��á�
	public static double zc(double bc){
		
		return bc*4;
	}
   //3�����һ�������������㳤�������������������ɺ���main�����е��á�
	public static double tj(double cc,double kk,double gg){
		return cc*kk*gg;
	}
   //4�����һ�����������������������͵����飬�ܹ�������Ӵ�С�������򡣲�����main�����е��á�
	/*
	public static void zs (int[] n){
	for(int i=0;i<n.length-1;i++){
		for(int j=0;j<n.length-1;j++){
			if(n[j]<n[j+1]){
			int a=n[j];n[j]=n[j+1];n[j+1]=a;
			}}}System.out.println(Arrays.toString(n));}	
			*/
	public static int[] arraySort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}return arr;
	}
	
   //5�����һ�����������ΪͶ�ҽ�����Ͷ��50��100���ͳ�ֵ�����޳�ֵ50��100��	
   //   ���ݲ�ͬ��Ͷ�Һͳ�ֵ�����ز�ͬ�Ľ�������������ɺ���main�����е��á�
	/*
	public static String tb(int ws,int yb,int cw,int cy ){
		if(ws >=cw && yb>=cw && yb>=cy){return "��ֵ�ɹ�";
		}else{return "��ֵʧ��";}}
		*/
	public static String cz(int a,int b){if(a==50){if(b==50){return"��ֵ�ɹ�";}else if(b==100){return"��ֵʧ��,�˻�50";}else{return"��ֵ����쳣";}
		}else if(a==100){if(b==50){return"��ֵ�ɹ�,����50";}else if(b==100){return"��ֵ�ɹ�";}else{return"��ֵ����쳣";}
		}else{return"Ͷ�ҽ���쳣";}
	    }
   //7�����һ���ɼ��ж�����������main�����е���
	/*
	 public static String cj(double kscj){
		 if(kscj>=60){return"�ɼ��ϸ�";}else{return"������";}}
		 */
	public static void score(double a){
		if(a<60 && a>=0){System.out.println("������");
		}else if(a>=60 && a<=100){System.out.println("����");
		}else{System.out.println("�ɼ��쳣");}
	    }
   //8�����һ�������ж������û��ڿ���̨������ݣ��������� ������/�������� ��������main�����е���
	/*
	 public static String rn(int nf){
		 if(nf%4==0 && nf%100!=0 || nf%400==0){return"������ѽ";}else{return"��������ѽ";}
	 }
	 */
	public static void lo(){
		Scanner sc = new Scanner(System.in);
		int year =sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}
   //9�����һ��nn�˷��ھ���ӡ�� ,�û��ڿ���̨���� n��ֵ ,��ӡ����Ӧ�Ľ����������main�����е���
	/*
	public static void sz(int n){
		for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){System.out.print(i+"*"+j+"="+(i*j)+" ");
		}System.out.println("");}
	    }
	    */
	public static void mul(){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i+"*"+j+"="+i*j+" ");
			}System.out.println("");
			}
	    }
	//10�����һ�����������ж������Ƿ���ϱ�׼��
	/*
	public static String tz(double sg,double zl){
		if(zl/(sg*sg)>18.5 && zl/(sg*sg)<23.9){return"ƽ��ˮƽ";
		}else if(zl/(sg*sg)>24 && zl/(sg*sg)<27.9){return"����:ƫ��";
		}else if(zl/(sg*sg)>=28 && zl/(sg*sg)<35){return"����:����";
		}else if(zl/(sg*sg))>=35 && zl/(sg*sg)<39.9){return"����:�ضȷ���";
		}else if(zl/(sg*sg)>=40){return"����:���ضȷ���";
		}else if(zl/(sg*sg)<18.5 && zl/(sg*sg)>15){return"ƫ��";
		}else{return"���������쳣(δ�����ˡ��˶�Ա���и������˵��޷����ݴ����ݽ��м���)";
		}
	    }
	*/
	public static void bmi(double h,double w){
		double bm =w/(h*h);
		if(bm<18.5){
			System.out.println("ƫ��");
		}else if(bm>=18.5 && bm<=23.9){
			System.out.println("��������");
		}else if(bm>=24 && bm<=27.9){
			System.out.println("����");
		}else if(bm>=27.9){
			System.out.println("����");
		}else{
			System.out.println("�����쳣");
		}
	}
	
	
public static void main(String[] args){
	//1�����һ����������������ε���������������ɺ���main�����е��á�
	double mj1=mj(4.5,3.5);
	System.out.println(mj1);  
	//2�����һ�������������������ε��ܳ������������ɺ���main�����е��á�
	System.out.println(zc(3.5));
	//3�����һ�������������㳤�������������������ɺ���main�����е��á�
	System.out.println(tj(3.5,2.5,2.5));
	//4�����һ�����������������������͵����飬�ܹ�������Ӵ�С�������򡣲�����main�����е��á�
	/*
	 int[] z ={5,9,7,8,4,6};
	 zs(z);
	 */
	int [] ints={5,9,1,3,8,7};
	int [] ins=arraySort(ints);
	System.out.println(Arrays.toString(ins));
	//5�����һ�����������ΪͶ�ҽ�����Ͷ��50��100���ͳ�ֵ�����޳�ֵ50��100��	
	//   ���ݲ�ͬ��Ͷ�Һͳ�ֵ�����ز�ͬ�Ľ�������������ɺ���main�����е��á�
	/*
     String je = tb(50,100,50,100);
	 System.out.println(je);
	 */
	 String str = cz(100,50);
	 System.out.println(str);
	//7�����һ���ɼ��ж�����������main�����е���
	 /*
	 System.out.println(cj(60));
	 */
	 score(60);
	//8�����һ�������ж������û��ڿ���̨������ݣ��������� ������/�������� ��������main�����е���
	 /*
	System.out.println(rn(2020));
	*/
	 lo();
	//9�����һ��nn�˷��ھ���ӡ�� ,�û��ڿ���̨���� n��ֵ ,��ӡ����Ӧ�Ľ����������main�����е���
	 /*
	Scanner kj = new Scanner(System.in);
	System.out.println("����������");
	int a =kj.nextInt();
	sz(a);
	*/
	 mul();
	//10�����һ�����������ж������Ƿ���ϱ�׼��
	 /*
	System.out.println(tz(1.70,70));
	*/
	bmi(1.70,70);
}	
}
