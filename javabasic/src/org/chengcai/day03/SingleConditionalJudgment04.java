package org.chengcai.day03;
/**
 * ������֧���
 * if(����){
 *����,���������Ϊtrue,��ִ��,���Ϊfalse,��ִ��
 *}
 */
public class SingleConditionalJudgment04 {
	public static void main(String[] args) {
		
		int a =10;
		int b =20;
		if(a<b){
			a++;
		}
		System.out.println(a);//11
	//��XX����һ�Ų�Ʊ���������500��,��ȥ��,��Ҫ��300��.
		String jieguo ="�н���"; //�н����
		int zjjine =5000000;   //�н����
		int maifang =3000000;  //�򷿻���
		int yue = zjjine;      //���
		if(jieguo.equals("�н���") && zjjine ==5000000){
			yue = zjjine -maifang;
		}
		System.out.println(yue);
		
		
		
		
		
	}
 

}
