package org.chengcai.day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 *   
 * 
 * 1�����һ����������������ε���������������ɺ���main�����е��á�
 * 2�����һ�������������������ε��ܳ������������ɺ���main�����е��á�
 * 3�����һ�������������㳤�������������������ɺ���main�����е��á�
 * 4�����һ�����������������������͵����飬�ܹ�������Ӵ�С�������򡣲�����main�����е��á�
   5�����һ�����������ΪͶ�ҽ�����Ͷ��50��100���ͳ�ֵ�����޳�ֵ50��100��
          ���ݲ�ͬ��Ͷ�Һͳ�ֵ�����ز�ͬ�Ľ�������������ɺ���main�����е��á�
   7�����һ���ɼ��ж�����������main�����е���
   8�����һ�������ж������û��ڿ���̨������ݣ��������� ������/�������� ��������main�����е���
   9�����һ��nn�˷��ھ���ӡ�� ,�û��ڿ���̨���� n��ֵ ,��ӡ����Ӧ�Ľ����������main�����е���
   10�����һ�����������ж������Ƿ���ϱ�׼��http://www.coozhi.com/shenghuojiaju/shenghuochangshi/42930.html   

   �������ʱӦ�ÿ��ǵ��� 
      1��������ͨ�õģ��߼�����ȷ�ģ�������©�߼���
      2������Ӧ�ô���ʲô���ݣ�����ʲô���ݡ� 
 *                             
 *                
 */

public class Function02 {
	
	//1�����һ����������������ε���������������ɺ���main�����е���	
	public static double area(double length,double width){		
		return length*width;
	}
	
	//2�����һ�������������������ε��ܳ������������ɺ���main�����е��á�
	public static double perimeter(double side){		
		return side*4;
	}
	
	//3�����һ�������������㳤�������������������ɺ���main�����е��á�
	public static double volume(double length,double width,double heigth){		
		return length*width*heigth;
	}
	
	//4�����һ�����������������������͵����飬�ܹ�������Ӵ�С�������򡣲�����main�����е��á�
	public static int[] arraySort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}		
		return arr;
	}
	
	//  5�����һ�����������ΪͶ�ҽ�����Ͷ��50��100���ͳ�ֵ�����޳�ֵ50��100��
    //���ݲ�ͬ��Ͷ�Һͳ�ֵ�����ز�ͬ�Ľ�������������ɺ���main�����е��á�
	public static String cz(int a,int b){
		if(a==50){
			if(b==50){
				return "��ֵ�ɹ�";
			}else if(b==100){
				return "��ֵʧ�ܣ��˻�50";
			}else{
				return "��ֵ��������쳣,����������";
			}			
		}else if(a==100){
			if(b==50){
				return "��ֵ�ɹ�,����50";
			}else if(b==100){
				return "��ֵ�ɹ�";
			}else{
				return "��ֵ��������쳣,����������";
			}			
		}else{
			return "Ͷ�ҽ���쳣";
		}
		
	}
	// 7�����һ���ɼ��ж�����������main�����е���
      public static void scores(double a){
		if(a<60 && a>=0){
			System.out.println("������");
		}else if(a>=60 && a<=100){
			System.out.println("����");
		}else{
			System.out.println("�ɼ��쳣");				
		}
	}
	
    // 8�����һ�������ж������û��ڿ���̨������ݣ��������� ������/�������� ��������main�����е���
      public static void lo(){//���÷��������������������������Ĵ���
    	  Scanner sc = new Scanner(System.in);
    	  int year =sc.nextInt();
    	  if(year%4==0 && year%100!=0 || year%400==0){
    		  System.out.println(year+"������");
    	  }else{
    		  System.out.println(year+"��������");
    	  }  	  
      }
    
      //9�����һ��nn�˷��ھ���ӡ�� ,�û��ڿ���̨���� n��ֵ ,��ӡ����Ӧ�Ľ����������main�����е���
      public static void mul(){
    	  Scanner sc = new Scanner(System.in); 
    	  int n=sc.nextInt();
    	  for(int i=1;i<=n;i++){
    		  for(int j=1;j<=i;j++){
    			  System.out.print(j+"X"+i+"="+i*j+" ");
    		  }
    		  System.out.println("");
    	  }    	  
      }
      
      //10�����һ�����������ж������Ƿ���ϱ�׼��http://www.coozhi.com/shenghuojiaju/shenghuochangshi/42930.html
      public static void bmi(double h,double w ){
    	  double bm =w/(h*h);
    	  if(bm<18.5){
    		  System.out.println("ƫ��");
    	  }else if(bm>=18.5 && bm<=23.9){
    		  System.out.println("��������");
    	  }else if(bm>23.9 && bm<=27.9){
    		  System.out.println("����");
    	  }else if(bm>27.9){
    		  System.out.println("����");    		  
    	  }else{
    		  System.out.println("���������쳣���޷�����");
    	  }
    	  
    	  
      }
      
      
      
      
//------------------------------------------------------------------------------------------------	
     public static void main(String[] args) {
		
    	 System.out.println(area(11,20));//200.0
    	 
    	 System.out.println(perimeter(5.5));//22.0
    	 
    	 System.out.println(volume(5.5,6.5,7.5));//268.125
    	 
    	 int[] ints={5,9,1,3,8,7};
    	 int[] ins=arraySort(ints);
    	 System.out.println(Arrays.toString(ins));
    	 
    	 String str =cz(20,100);
    	 System.out.println(str);
    	 
    	 scores(100);
    	 
    	 lo();
    	 
    	 mul();
    	 
    	 bmi(1.85,70);
	}
	
     
     
	
}
