package org.chengcai.day11interface03;


/**
 * 
 *  final���������࣬����������
      1��final���ε��࣬���������࣬�����ٱ��̳У������������ࣩ
      2��final���η����������ٱ�������д
      3��final�������ԣ�ֵ���ܱ��޸ģ�Ϊ������ 

 *
 */
public class TestFinal {
	
	// ���õĳ������壺
    public static final char SEX1 = '��';
    public final static char SEX2 = 'Ů';

    public static void main(String[] args) {
        int i = 10;
        i = 20;
        System.out.println(i);
        final int j = 10;
        // j = 20; //���д��뱨�� ��final���εı��� ֵ���ܱ����ġ�
        char c = TestFinal.SEX1; // ʹ�ó���
    }

	

}
