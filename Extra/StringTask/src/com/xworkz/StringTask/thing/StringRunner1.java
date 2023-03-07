package com.xworkz.StringTask.thing;

public class StringRunner1 {


	public static void main(String[] args) {
		
		String str="Sachin";
		
		String str1="Irfan Khan";
		
		String str2="";
		
		String str3="            My Name is Irfan                 k";
		
		String str4="my!name!Is!Irfan!Khan";
		
		String str5="myTnameTisTRahulTkumar";
		
		System.out.println(str);
		
		str.concat("Tendulkar"); //concat() method appends the string at the end
		
		System.out.println(str); //print Sachin because string are immutable
		
		System.out.println("1 concat() method-----");
		str=str.concat("Tendulkar");////1. concat()
		System.out.println(str);
		
		System.out.println("2 charAt(0) method-----");
		System.out.println(str.charAt(0));//2. charAt()
		
		System.out.println("3 codePointAt(6) method-----");
		System.out.println("ASCII value of "+str.charAt(6)+" is: "+str.codePointAt(6)); //3.codePointAt()
		
		System.out.println("4.codePointBefore(6)------------");
		System.out.println("ASCII Value Of Character which Before "+str.charAt(6)+" is: "+str.codePointBefore(6));//4.codePointBefore()

		System.out.println("5.codePointCount(1,6)------------");
		System.out.println(str.codePointCount(1, 6));//5.codePointCount(1, 6)
	
		System.out.println("6.compareTo()------------");
		System.out.println(str.compareTo(str1));//6.compareTo()
	
		System.out.println("7.compareToIgnoreCase()------------");
		System.out.println(str.compareToIgnoreCase(str1));//7.compareToIgnoreCase(str1)

		System.out.println("8.contains()------------");
		System.out.println(str.contains("SacH"));//8.contains();//true or false
		
		System.out.println("9.contentEquals()------------");
		System.out.println(str.contentEquals("Sachin"));//9.contentEquals("Sachin")
		
		System.out.println(str.contains("Sach"));
		System.out.println(str.contentEquals("SachinTendulkar"));
		
		System.out.println("10.endsWith()------------");
		System.out.println(str.endsWith("lkar"));//10.endsWith();
		
		System.out.println("11.equals()------------");
		System.out.println(str.equals("SachinTendulka"));//11.equals()
		
		System.out.println("12.equalsIgnoreCase()------------");
		System.out.println(str.equalsIgnoreCase("sachintendulkar"));//12.equalsIgnoreCase()
		
		System.out.println("13.format()------------");
		System.out.println(str1.format(str2, args));//13.format()
		
		
		System.out.println("14.hashCode()------------");
		System.out.println("Hashcode of str: "+str+" is: "+str.hashCode());//14.hashCode()
		
		System.out.println("15.indent()------------");
		System.out.println("Printing after given space:"+str.indent(10));//15.indent();
		
		System.out.println("16.indexOf()------------");
		System.out.println(str.indexOf(5));//16.indexOf(5) Not understand this method
		
		System.out.println("16.indexOf()------------");
		System.out.println(str.indexOf("Sac"));//output 0 and -1 not understand
		
		System.out.println(str.indexOf(str, 5));//Also not understand this method
		
		System.out.println("17.intern()------------");
		System.out.println(str1.intern());//17.intern()
		
		System.out.println("18.isBlank()------------");
		System.out.println(str2.isBlank());//18.isBlank()
		
		System.out.println("19.isEmpty()------------");
		System.out.println(str2.isEmpty());//19.isEmpty()
		
		System.out.println("20.lastIndexOf()------------");
		System.out.println(str.lastIndexOf("T"));//20.lastIndexof();//not understand
		
		System.out.println(str.lastIndexOf(14));
		
		System.out.println(str.lastIndexOf("Sachin", 10)); //output is 0 and 1 and -1 not understood this method
		
		System.out.println("21.length()------------");
		System.out.println("String str langht is :"+str.length());//21.length()
		
		System.out.println("String str1 langht is :"+str1.length());//21.length()
		
		System.out.println("22.matches()------------");
		System.out.println(str.matches("SachinTendulkar"));//22. matches()	
		
		System.out.println("23.offsetByCodePoints()------------");
		System.out.println(str.offsetByCodePoints(1, 10));//23. offsetByCodePoints(0,0) not understood 
		
		System.out.println("24.regionMatches()------------");
		System.out.println(str.regionMatches(2, str1, 3, 5)); //24.regionMatches(2, str2, 3, 5)
		
		System.out.println("25.repeat()------------");
		System.out.println(str.repeat(3));//25.repeat() method
		
		System.out.println("26.replace()------------");
		System.out.println(str.replace("Sachin", "Rahul"));//26.replace()
		
		System.out.println("27.replaceAll()------------");
		System.out.println(str.replaceAll("Sachin", str1)); //27. what is difference b/w replace() and replaceAll()
		
		System.out.println("28.replaceFirst()------------");
		System.out.println(str.replaceFirst("Tendulkar", "jay"));//28. replaceFirst()
		
		System.out.println("29.startsWith()------------");
		System.out.println(str.startsWith("SachinTe"));//29. startWith()
		
		System.out.println("30.startsWith()------------");
		System.out.println(str.startsWith("Ten", 6));//30. startWith(" ",0)
		
		System.out.println("31.strip()-----------------------");
		System.out.println(str3.strip());//31. strip(); using removing before white space
		
		System.out.println("32.stripIndent()-----------------------");
		System.out.println(str3.stripIndent());//32. stripIndent(); what is difference strip() and this
		
		System.out.println("33.stripLeading()-----------------------");
		System.out.println(str3.stripLeading());//33
		
		System.out.println("34.stripTrailing()-----------------------");
		System.out.println(str3.stripTrailing());//34
		
		System.out.println("35.substring()-----------------------");
		System.out.println(str.substring(13));//35
		
		System.out.println("36.substring(6,15)-----------------------");
		System.out.println(str.substring(6, 15));//36
		
		System.out.println("37.toLowerCase()-----------------------");
		System.out.println(str.toLowerCase());//37
		
		System.out.println("38.toUpperCase()-----------------------");
		System.out.println(str.toUpperCase());//38
		System.out.println(str3.toUpperCase());
		
		System.out.println("39.toCharArray()-----------------------");
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("40.toString()-----------------------");
		System.out.println(str.toString());//40
		
		System.out.println("41.copyValueOf()-----------------------");
		char[] str6= {'H','e','l','l','o'};
		String str7="";
		str7=str7.copyValueOf(str6);
		System.out.println(str7);//41
		
		char[] str8= {'H','e','l','l','o','J','a','v','a'};
		String str9="";
		str9=str9.copyValueOf(str8, 1, 6);
		System.out.println(str9);//41
		
		System.out.println("42.trim()-----------------------");
		System.out.println(str3.trim());//42 trim()// remove space 
		
		System.out.println("43.getClass()-----------------------");
		System.out.println(str2.getClass());//43 getClass();
		
		
		System.out.println(str5.split("T"));
		System.out.println("44.split(!,4)-----------------------");
		String[] arr=str4.split("!",4);//44
		for(String a : arr)
			System.out.println(a);
		
		System.out.println("45.split(T)-----------------------");
		String[] arr1=str5.split("T");//45
		for(String a : arr1)
			System.out.println(a);
		
		System.out.println("46.subSequence(2,10)-----------------------");
		System.out.println(str4.subSequence(2, 10));//46
		
		System.out.println("47.codePointAt(9)-----------------------");
		System.out.println("Aasci value of "+str4.charAt(9)+" is: "+str4.codePointAt(9));//47
		
		System.out.println("47.codePointAt(9)-----------------------");
		int code=str4.codePointAt(9);
		System.out.println(code);//47
		
		
		System.out.println("48. getBytes()---------------");
		byte[] a=str.getBytes();//48
		for(byte b:a) {
			System.out.print(b+" ");
		}
		
	}

}
