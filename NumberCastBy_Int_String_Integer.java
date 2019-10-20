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
		
	}
}
