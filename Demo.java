package day01;
/**
 * @author Administrator
 * ���õĿ�ݼ�
 * Alt+/:�����ʾ����
 * Ctrl+D:����ɾ��һ��
 * Ctrl+Z:���˵���һ��
 * Ctrl+Y:ǰ������һ��
 * Ctrl+S:���ٱ���
 * Ctrl+Shift+f:���ٹ淶�����ʽ
 */
public class Demo {
	//main ��������
	public static void main(String[] args) {
		//syso
		System.out.println("Hello,java");
		/**
		 * java�еİ˴�������:
		 * ������
		 * ��������
		 * byte:ȡֵ��Χ-128~127
		 * short
		 * int:ȡֵ��Χ-2147483648~2147483647
		 * ������: long
		 * С����
		 * double:
		 * float:
		 * �ַ���char,ȡֵ��Χ0~65535
		 * ��������:boolean
		 */
		/*
		 * java�����Ҫʹ��ĳһ������,
		 * �ͱ�����������
		 * �൱��Сѧ��ѧ������һ��δ֪��x
		 */
		//����һ������x,����ֵΪ10
		//ע��:��������Ĭ�ϵ���int,
		//С������Ĭ�ϵ���double
		int x=10;
		double x1=10.1;
		/**
		 * ���͵Ĵ�С֮��
		 * �Զ�����ת��:
		 * С����������,���Զ���ת���ɴ�
		 * ����������
		 * 
		 * ǿ������ת��:
		 * �������������,ǿ��ת����
		 * С����������
		 */
		//float x2=10.1;//�������
		float x2=(float)10.1;//ǿ��ת��
		long x3=10;//�Զ�ת��
		
		/**
		 * ��������������:
		 * 1.���������ֿ�ͷ
		 * 2.ֻ����_,Ӣ����ĸ,$��ͷ
		 * 3.ʹ���շ�������
		 *   ����:huangJing
		 * 4.��������֪��
		 * 5.������java�еĹؼ���
		 */
		char a='��';
		char a1='a';
		char a2=97;
		char a3=98;
		System.out.println(a);//��
		System.out.println(a1);//a
		System.out.println(a2);//a
		System.out.println(a3);//b
		
		//boolean����:ֻ������ֵ:true,false
		boolean flag=true;//Ϊ��
		boolean flag1=false;//Ϊ��
		
		//ֱ������һ��float���͵ı���ֵ
		float a4=10.1F;
		//ֱ������һ��long���͵ı���ֵ
		long a5=10L;
		
		/*
		 * �ַ�������
		 * String:��������
		 */
		String str="�ú�ѧϰ";
		System.out.println(str);
		
		/*
		 * �ַ�����ƴ��
		 * ����:���������Ϣ
		 * ����:int
		 * ����:String
		 * �Ա�:String����char
		 * н��:double
		 */
		int age=20;
		String name="������";
		String sex="��";
		double salary=2000.0;
		//�ַ�����ƴ��
		//�ַ������κ��������͵ı������
		//��������ַ���(˫��������Ļ�ԭ�����)
		System.out.println(
				"����:"+name+
				",����:"+age+
				",�Ա�:"+sex+
				",нˮ:"+salary);
		/**
		 * ���������
		 * +,-,*,/,%
		 * �߼������
		 */
		
	}
}





