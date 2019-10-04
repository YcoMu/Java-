package day01;
/**
 * @author Administrator
 * 常用的快捷键
 * Alt+/:快捷提示代码
 * Ctrl+D:快速删除一行
 * Ctrl+Z:回退到上一步
 * Ctrl+Y:前进到上一步
 * Ctrl+S:快速保存
 * Ctrl+Shift+f:快速规范代码格式
 */
public class Demo {
	//main 程序的入口
	public static void main(String[] args) {
		//syso
		System.out.println("Hello,java");
		/**
		 * java中的八大基本類型:
		 * 整数：
		 * 短整数：
		 * byte:取值范围-128~127
		 * short
		 * int:取值范围-2147483648~2147483647
		 * 长整数: long
		 * 小数：
		 * double:
		 * float:
		 * 字符：char,取值范围0~65535
		 * 布尔类型:boolean
		 */
		/*
		 * java中如果要使用某一类数据,
		 * 就必须声明变量
		 * 相当于小学数学中设置一个未知数x
		 */
		//声明一个变量x,它的值为10
		//注意:整数类型默认的是int,
		//小数类型默认的是double
		int x=10;
		double x1=10.1;
		/**
		 * 类型的大小之分
		 * 自动类型转换:
		 * 小的数据类型,会自动的转换成大
		 * 的数据类型
		 * 
		 * 强制类型转换:
		 * 将大的数据类型,强制转换成
		 * 小的数据类型
		 */
		//float x2=10.1;//编译错误
		float x2=(float)10.1;//强制转换
		long x3=10;//自动转换
		
		/**
		 * 变量的命名规则:
		 * 1.不能以数字开头
		 * 2.只能以_,英文字母,$开头
		 * 3.使用驼峰命名法
		 *   例如:huangJing
		 * 4.尽量见名知意
		 * 5.不能是java中的关键字
		 */
		char a='男';
		char a1='a';
		char a2=97;
		char a3=98;
		System.out.println(a);//男
		System.out.println(a1);//a
		System.out.println(a2);//a
		System.out.println(a3);//b
		
		//boolean类型:只有两个值:true,false
		boolean flag=true;//为真
		boolean flag1=false;//为假
		
		//直接声明一个float类型的变量值
		float a4=10.1F;
		//直接声明一个long类型的变量值
		long a5=10L;
		
		/*
		 * 字符串类型
		 * String:引用类型
		 */
		String str="好好学习";
		System.out.println(str);
		
		/*
		 * 字符串的拼接
		 * 例如:输出个人信息
		 * 年龄:int
		 * 姓名:String
		 * 性别:String或者char
		 * 薪资:double
		 */
		int age=20;
		String name="蔡旭坤";
		String sex="男";
		double salary=2000.0;
		//字符串的拼接
		//字符串和任何数据类型的变量相加
		//结果还是字符串(双引号里面的会原样输出)
		System.out.println(
				"姓名:"+name+
				",年龄:"+age+
				",性别:"+sex+
				",薪水:"+salary);
		/**
		 * 算术运算符
		 * +,-,*,/,%
		 * 逻辑运算符
		 */
		
	}
}





