package com.xworkz.collection.boot;
import java.util.*;
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Stack;
//import java.util.Vector;

public class Runner {

	public static void main(String[] args) {
		
		Collection<String> name=new ArrayDeque<String>();
		String name1="Irfan-Khan", name2="Rahul-420", name3="Karan-Mishra", name4="Nadeem-Ahmed", name5="Jay-singh", name6="Jay-pal", name7="Mohit-kumar", name8="Atul-jaiswal", name9="Aamir-khan", name10="Kartik-sharma";
		name.add(name1);
		name.add(name2);
		name.add(name3);
		name.add(name4);
		name.add(name5);
		name.add(name6);
		name.add(name7);
		name.add(name8);
		name.add(name9);
		name.add(name10);
		int TotalSizeOfString=name.size();
		System.out.println("1. Total size of string is: "+TotalSizeOfString);
		name.clear();
		System.out.println("String size After Clear Method: "+name.size());
		
		Iterator itr=name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------------------------------------");
		
		List<Character> character=new LinkedList<Character>();
		char a='A',b='9',c='C',d='0',e='E',f='F',g='G',h='H',i='I',j='J';
		character.add(a);
		character.add(b);
		character.add(c);
		character.add(d);
		character.add(e);
		character.add(f);
		character.add(g);
		character.add(h);
		character.add(i);
		character.add(j);
		int totalSizeOfCharacter=character.size();
		System.out.println("2. Total Size of Character:"+totalSizeOfCharacter);
		character.clear();
		System.out.println("size of Character After clear method:"+character.size());
		
		System.out.println("--------------------------------------------------------------");
		
		Vector<Integer> integer=new Stack<Integer>();
		int a1=-2147483648, a2=12546444, a3=139946564, a4=14646466, a5=1646464664, a6=1766446446, a7=186464, a8=19644464, a9=201646464, a10=2147483647;
		integer.add(a1);
		integer.add(a2);
		integer.add(a3);
		integer.add(a4);
		integer.add(a5);
		integer.add(a6);
		integer.add(a7);
		integer.add(a8);
		integer.add(a9);
		integer.add(a10);
		int totalSizeOfInteger=integer.size();
		System.out.println("3. Total Size Of Integer:"+totalSizeOfInteger);
		integer.clear();
		System.out.println("Size of Integer After clear method:"+integer.size());
	
		System.out.println("-------------------------------------------------------------");
		
		Queue<Long> longValue=new PriorityQueue<Long>();
		long l1=-9223372036854775808L, l2=1234564997890l, l3=123456547890l, l4=1234566467890L, l5=1234565467890L, l6=1234567854590L, l7=12656434567890L, l8=123456789654660L, l9=1234567890123456789L, l10=9223372036854775807L;
		longValue.add(l1);
		longValue.add(l2);
		longValue.add(l3);
		longValue.add(l4);
		longValue.add(l5);
		longValue.add(l6);
		longValue.add(l7);
		longValue.add(l8);
		longValue.add(l9);
		longValue.add(l10);
		int totalSizeOfLong=longValue.size();
		System.out.println("4. Total Size Of Long"+totalSizeOfLong);
		longValue.clear();
		System.out.println("Size of Long After clear Mathod:"+longValue.size());
		
		System.out.println("--------------------------------------------------------------");
		
		Deque<Float> floatValue=new ArrayDeque<Float>();
		floatValue.add(123456789011234456789999.4f);
		floatValue.add(123456789012345678901234567890123456799.04f);
		floatValue.add(13.54f);
		floatValue.add(35.47F);
		floatValue.add(33.46f);
		floatValue.add(31.44f);
		floatValue.add(53.43f);
		floatValue.add(63.42f);
		floatValue.add(37.41f);
		floatValue.add(36.45f);
		int totalSizeOfFloat=floatValue.size();
		System.out.println("5. Total Size Of Float:"+totalSizeOfFloat);
		floatValue.clear();
		System.out.println("Size Of Float After clear Method:"+floatValue.size());
		
		System.out.println("-----------------------------------------------------------");
		
		List<Double> doubleValue=new Stack<>();
		double d1=1234567891011121314.12345678910d, d2=1234567891011121314.12345678910D, d3=1234567891011121314.12345678910, d4=1234567891011121314.12345678910, d5=1234567891011121314.12345678910, d6=1234567891011121314.12345678910, d7=1234567891011121314.12345678910, d8=1234567891011121314.12345678910, d9=1234567891011121314.12345678910, d10=1234567891011121314.12345678910;
		doubleValue.add(d1);
		doubleValue.add(d2);
		doubleValue.add(d3);
		doubleValue.add(d4);
		doubleValue.add(d5);
		doubleValue.add(d6);
		doubleValue.add(d7);
		doubleValue.add(d8);
		doubleValue.add(d9);
		doubleValue.add(d10);
		int totalSizeOfDouble=doubleValue.size();
		System.out.println("6. Total Size of Double:"+totalSizeOfDouble);
		doubleValue.clear();
		System.out.println("Size of Double after clear Method:"+doubleValue.size());
		
		System.out.println("-------------------------------------------------------------");
		
		Collection<Short> shortValue=new Vector<>();
		short s1=-32768, s2=-32767, s3=30245, s4=5896, s5=12345, s6=12345, s7=12345, s8=12345, s9=12345, s10=32767;
		shortValue.add(s1);
		shortValue.add(s2);
		shortValue.add(s3);
		shortValue.add(s4);
		shortValue.add(s5);
		shortValue.add(s6);
		shortValue.add(s7);
		shortValue.add(s8);
		shortValue.add(s9);
		shortValue.add(s10);
		int TotalSizeOfShort=shortValue.size();
		System.out.println("7. Total Size of Short :"+TotalSizeOfShort);
		shortValue.clear();
		System.out.println("Size Of Short after clear Method:"+shortValue.size());
		
		System.out.println("--------------------------------------------------------------");
		
		Collection<Byte> byteValue=new ArrayList<Byte>();
		byte value1=-128, value2=-122, value3=-1, value4=1, value5=92, value6=102, value7=120, value8=127, value9=10, value10=127;
		byteValue.add(value1);
		byteValue.add(value2);
		byteValue.add(value3);
		byteValue.add(value4);
		byteValue.add(value5);
		byteValue.add(value6);
		byteValue.add(value7);
		byteValue.add(value8);
		byteValue.add(value9);
		byteValue.add(value10);
		
		int totalSizeOfByte =byteValue.size();
		System.out.println("8. Total size Of Byte: "+totalSizeOfByte);
		byteValue.clear();
		System.out.println("Byte size after clear method:"+byteValue.size());
		
		System.out.println("---------------------------------------------------------");

		List<Boolean> booleanValue=new Vector<>();
		booleanValue.add(true);
		booleanValue.add(true);
		booleanValue.add(true);
		booleanValue.add(false);
		booleanValue.add(true);
		booleanValue.add(false);
		booleanValue.add(true);
		booleanValue.add(false);
		booleanValue.add(false);
		booleanValue.add(false);
		int totalSizeOfBoolean=booleanValue.size();
		System.out.println("9. Total Size Of Boolean: "+totalSizeOfBoolean);
		booleanValue.clear();
		System.out.println("Boolean Size  after clear Method:"+booleanValue.size());
		
	}

}
