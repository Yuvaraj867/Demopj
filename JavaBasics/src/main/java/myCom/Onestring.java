package myCom;

public class Onestring {

	public static void main(String[] args) {
		String s1 = "wicketkeeper ";
		String s2= new String("batsman");
		System.out.println(s1);
		System.out.println(s2);
System.out.println(s1.indexOf("e"));
System.out.println(s1.trim());
	
	
		System.out.println(s1.toUpperCase());
		System.out.println(String.join("/", "s","w","v"));
		String i = "vicky";
		System.out.println(s1.replace("k", "z"));
		System.out.println(s2.indexOf("m", 2));
	
	
	StringBuffer name1 = new StringBuffer("Agni");
	System.out.println(name1.reverse());
	System.out.println(name1.replace(0, 3, "toact"));
	//System.out.println(name1.delete(0, 5));
	System.out.println(name1.insert(4, "work"));
	System.out.println(name1.capacity());
	
	String a11 = "who,am,I";
	
	String[]a12 = a11.split(",");
	for(String a13:a12) {
		System.out.println(a13);
	}
	 {
	        String str = "geekss@for@geekss";
	        String[] arrOfStr = str.split("@");
	 
	        for (String a : arrOfStr)
	            System.out.println(a);
	    }
}} 

