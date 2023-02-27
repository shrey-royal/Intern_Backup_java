public class StringMethods {
	public static void main(java.lang.String[] args) {
		String s1 = "RoyalRoyal";
		String s2 = "royal";
		String s3 = "ROYAL";	//array of character
		
//		System.out.println(s1);
//		System.out.println(s1.length());
//		System.out.println(s1.charAt(0));
		
//		for(int i=0; i<s1.length(); i++){
//			System.out.print(s1.charAt(i));
//		}
		
//		System.out.println(s1.compareTo(s3));
//		> 0 -> o - O
//		< 0 -> O - o
//		= 0 -> o - o
		
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.contains("y"));
//		System.out.println(s1.compareToIgnoreCase(s3));
//		System.out.println(s1.endsWith("a"));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.indexOf("a"));
//		System.out.println(s1.indexOf("o", 3));	//start, end index
//		System.out.println(s1.indexOf("y", 5));
//		System.out.println(s1.replace("y", "c"));
//		System.out.println(s1.lastIndexOf("y"));
		
		StringBuffer strBuff = new StringBuffer();//used to create mutable strings
		strBuff.append("Shrey");
		
		System.out.println(strBuff);
		
		System.out.println(strBuff.capacity());
		System.out.println(strBuff.length());
		
		System.out.println(strBuff.insert(4, "royal tech"));
		System.out.println("royal tech".length());
//		System.out.println(strBuff.reverse());
		System.out.println(strBuff.delete(4, "royal tech".length()+4));
		System.out.println(strBuff.replace(0, strBuff.length(), "Royal Technosoft"));
		
		
	}

}
