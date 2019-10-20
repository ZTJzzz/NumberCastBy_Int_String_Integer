package Int_String_Integer之间类型转换;

/**
 * 
 * 三种最常见数据类型之间的转换（int - String - Integer）
 * 可详见JavaAPI文档
 * @author ztj
 *
 */
public class NumberCastBy_Int_String_Integer {

	public static void main(String[] args) {
		
		//int --> String
		int i1 =10;
		String s1 = i1 + "";
		
		//String --> int
		String s2 = "123";
		int i2 = Integer.parseInt(s2);
		
		//int --> Integer
		int i3 = 10;
		Integer integer3 = Integer.valueOf(i3);
		
		//Integer --> int
		Integer integer4 = new Integer(10);
		int i4 = integer4.intValue();
		
		//Integer --> String
		Integer integer5 = new Integer(10);
		String s5 = integer5.toString();
		
		//String --> Integer
		String s6 = new String("123");
		Integer integer6 = Integer.valueOf(s6);
		
		
		/**
		 * 自动装箱和自动拆箱是jdk5.0以后的新特性
		 * 如：
		 * 	int ---> Integer  装箱
		 * 	Integer ---> int  拆箱
		 * 
		 */
		//自动装箱
		Integer integer7 = 10;
		
		//自动拆箱
		int i7 = integer7;
		
		/**
		 * 注意：
		 * 首先 Integer integer8 = 128   等同于  Integer integer8 = new Integer(128);
		 * 
		 * 如果数据是在（-128 ~ 127）之间，Java引入了一个“整数型常量池”，在方法区中
		 * 整数型常量池 只存储 -128 ~ 127 之间的数据，
		 * 是因为这些数据最常用。
		 * 
		 * 另外，Integer类型的数据判断大小不能使用“==”, 应该使用equals()方法
		 * 
		 */
		Integer integer8 = 128;
		Integer integer9 = 128; 
		System.out.println(integer8 == integer9);   //false
		System.out.println(integer8.equals(integer9));//true
		
		Integer integer10 = 127;
		Integer integer11 = 127; // 这里不再创建新的对象，而是从数据型常量池中直接获取
		System.out.println(integer10 == integer11);   //true
		System.out.println(integer10.equals(integer11));//true
		
		Integer integer12 = -128;
		Integer integer13 = -128;// 这里不再创建新的对象，而是从数据型常量池中直接获取
		System.out.println(integer12 == integer13);   //true
		System.out.println(integer12.equals(integer13));//true
		
		Integer integer14 = -129;
		Integer integer15 = -129;
		System.out.println(integer14 == integer15);   //false
		System.out.println(integer14.equals(integer15));//true
		
	}
}
