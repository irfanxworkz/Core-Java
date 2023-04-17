package com.xworkz.mla.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.mla.constant.Gender;
import com.xworkz.mla.dto.MlaDTO;

public class MlaRunner {

	public static void main(String[] args) {
		
		Collection<MlaDTO> mla=new ArrayList<>();
		
		mla.add(new MlaDTO("Mane Shrinivas", 61, "Hanagal", "INC", Gender.MALE , false));
		mla.add(new MlaDTO("Sanjeeva Matandoor", 48, "Puttur", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Aihole Duryodhan Mahalingappa", 36, "Raibag", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("D S Suresh", 51, "Tarikere", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Yadwad Mahadevappa Shivalingappa", 54, "Ramadurg", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Siddu Savadi", 61, "Terdal", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("B C Nagesh", 38, "Tiptur", "BJP", Gender.MALE, true));
		mla.add(new MlaDTO("S Suresh Kumar", 54, "Rajajinagar", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("G B Jyothi Ganesh", 57, "Tumkur City", "BJP", Gender.FEMALE, false));
		mla.add(new MlaDTO("Jayaram A S", 59, "Turuvekere", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("K Raghupathi Bhat", 62, "Udupi", "BJP", Gender.MALE, true));
		mla.add(new MlaDTO("Dr S Shivaraj Patil", 50, "Raichur", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("R Shankar", 78, "Ranebennur", "KPJP", Gender.MALE, false));
		mla.add(new MlaDTO("Basanagouda Somanagouda Patil", 61, "Devara Hippargi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("S Kumar Bangarappa", 48, "Soraba", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Nagendra L", 36, "Chamaraja", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("K Madal Virupakshappa", 51, "Channagiri", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Uday B Garudachar", 54, "Chickpet", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("C T Ravi", 61, "Chikmagalur", "BJP", Gender.MALE, true));
		mla.add(new MlaDTO("J C Madhuswamy", 38, "Chikkanayakanahalli", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("G H Thippa Reddy", 54, "Chitradurga", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("B M Sukumar Shetty", 57, "Baindur", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("K Shivanagouda Naik", 59, "Devadurga", "BJP",  Gender.MALE, true));
		mla.add(new MlaDTO("Ballary Virupakshappa Rudrappa", 62, "Byadagi", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("Amrut Ayyappa Desai", 50, "Dharwad", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("Paranna Ishwarappa Munavalli", 78, "Gangavathi", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("H Halappa", 61, "Sagara", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("Shankar Patil Munenakoppa", 48, "Navalgund", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("Dr Umesh G Jadhav", 36, "Chincholi", "INC",  Gender.MALE, true));
		mla.add(new MlaDTO("Priyanka M Kharge", 51, "Chittapur", "INC", Gender.FEMALE, false));
		mla.add(new MlaDTO("Patil Mallanagouda Basavanagouda", 54, "Babaleshwar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Ramalinga Reddy", 61, "B. T. M Layout", "INC",  Gender.MALE, false));
		mla.add(new MlaDTO("T Venkataramanaiah", 38, "Doddaballapur", "INC",  Gender.MALE, false));
		mla.add(new MlaDTO("C C Patil", 54, "Naragund", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("R Ashoka", 57, "Padmanaba Nagar", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Jolle Shashikala Annasaheb", 59, "Nippani", "BJP",  Gender.FEMALE, false));
		mla.add(new MlaDTO("Venkatreddy Mundal", 62, "Yadagir", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("S R Vishwanath", 50, "Yelahanka", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("B Harshavardhan", 78, "Nanjangud", "BJP",  Gender.MALE, true));
		mla.add(new MlaDTO("S Angara", 61, "Sullia", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("Achar Halappa Basappa", 48, "Yelburga", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("Araga Jnanendra", 36, "Thirthahalli", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("K G Bopaiah", 51, "Virajpet", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Kalakappa Gurushanthappa Bandi", 54, "Ron", "BJP",  Gender.MALE, false));
		mla.add(new MlaDTO("K B Ashok Naik", 61, "Shimoga Rural", "BJP", Gender.MALE, true));
		mla.add(new MlaDTO("Narasimha Nayak (RAJU Gouda)", 38, "Shorapur", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("K S Eswarappa", 54, "Shimoga", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("B S Yediyurappa", 57, "Shikaripura", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Basavaraj Bommai", 59, "Shiggaon", "BJP", Gender.MALE, true));
		mla.add(new MlaDTO("Rajkumar Patil", 62, "Sedam", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Visweswara Heggade Kageri", 50, "Sirsi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Vishwanath Chandrashekar Mamani", 78, "Saundatti Yellamma", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("M S Somalingappa", 61, "Siruguppa", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Dattatraya Chandrasekar Patil Revoor (APPUGOUDA)", 48, "Gulbarga Dakshin", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Ramanna S Lamani", 36, "Shirahatti", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("M Chandrappa", 51, "Holalkere", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("V Somanna", 54, "Govindraj Nagar", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Lalaji R Mendon", 61, "Kaup", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("D Vedavyasa Kamath", 38, "Mangalore City South", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("N Linganna", 54, "Mayakonda", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("B Sriramulu", 57, "Molakalmuru", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Umanatha A Kotian", 62, "Moodabidri", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("A S Patil (NADAHALLI)", 50, "Muddebihal", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Karajola Govinda Maktappa", 78, "Mudhol", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Aravinda Limbavali", 61, "Mahadevapura", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Katti Umesh Vishwanath", 48, "Hukkeri", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Preetham J Gowda", 36, "Hassan", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("C S Niranjan Kumar", 51, "Gundlupet", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("K Poornima", 54, "Hiriyur", "BJP", Gender.FEMALE, false));
		mla.add(new MlaDTO("M P Appachu Ranjan", 61, "Madikeri", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("M P Renukacharya", 38, "Honnali", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Goolihatti D Shekar", 54, "Hosadurga", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Doddagoudar Mahantesh Basavantaray", 57, "Kittur", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Aravind Chandrakant Bellad", 59, "	Hubli-Dharwad-West", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Roopali Santosh Naik", 62, "Karwar", "BJP", Gender.FEMALE, false));
		mla.add(new MlaDTO("Doddanagouda Gundanagouda Patil", 50, "Hungund", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("S V Ramachandra", 78, "Jagalur", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Prakash K S", 61, "Kadur", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("C M Nimbannavar", 48, "Kalghatagi", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Basavaraj Dadesugur", 36, "Kanakagiri", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("M P Kumaraswamy", 51, "Mudigere", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Jagadish Shettar", 54, "Hubli-Dharwad-Central", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Olekar Neharu Chanabasappa", 61, "Haveri", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Gali Somashekara Reddy", 38, "Bellary City", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Dinesh Gundurao", 54, "Gandhinagar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("V Sunil Kumar", 57, "Karkala", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("S A Ravindranatha", 59, "Davanagere North", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Abhay Patil", 62, "Belgaum Dakshin", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Guttedar Subhash Rukmayya	", 50, "Aland", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Balachandra Lakshmanrao Jarakiholi", 78, "Arabhavi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Prabhu B Chavhan", 61, "Aurad", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Veerabhadrayya (VEERANNA) Charantimath", 48, "Bagalkot", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("M Krishnappa", 36, "Bangalore South", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Rajesh Naik U", 51, "Bantwal", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("S Raghu", 54, "C.V Raman Nagar", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Dr C N Ashwath Narayana", 61, "Malleshwaram", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("G Karunakara Reddy", 38, "Harapanahalli", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Basawaraj Mattimud", 54, "Gulbarga Rural	", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Harish Poonja", 57, "Belthangady", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Sunil Biliya Naik", 59, "Bhatkal", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Basanagouda Ramanagouda Patil(Yatnal)", 62, "Bijapur City", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Nirani Murugesh Rudrappa", 50, "Bilgi", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Satish Reddy", 78, "Bommanahalli", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("L A Ravisubramanya", 61, "Basavanagudi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Dr Bharath Shetty Y", 48, "Mangalore City North", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("S A Ramadas", 36, "Krishnaraja", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("P Rajeev", 51, "Kudachi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("N Y Gopalakrishna", 54, "Kudligi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Dinakar Keshav Shetty", 61, "Kumta", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Haladi Srinivasa Shetty.", 38, "Kundapura", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Anil S Benake", 54, "	Belgaum Uttar", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("E Tukaram", 57, "Sandur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("U T Khadar", 59, "Mangalore", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Raja Venkatappa Nayak", 62, "Manvi", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("M Srinivas", 50, "Mandya", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("C N Balakrishna", 78, "Sravanabelagola", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("D C Thammanna", 61, "Maddur", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Dr K Annadani", 48, "Malavalli", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("A Manjunath", 36, "Magadi", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Ravindra Srikantaiah", 51, "Shrirangapattana", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("M V Veerabhadraiah", 54, "Madhugiri", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("S R Srinivas (VASU)", 61, "Gubbi", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Anil Kumar C", 38, "Heggadadevankote", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Nagangouda Kandkur", 54, "Gurmitkal", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("Rajashekar Basavaraj Patil", 57, "Humnabad", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("C S Puttaraju", 59, "Melukote", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("R Narendra", 62, "Hanur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("K J George", 50, "Sarvagnanagar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("S Ramappa", 78, "Harihar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Abbayya Prasad", 61, "Hubli-Dharwad-East", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Sharanabasappa Darshanapur", 48, "Shahapur", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("M T B Nagaraju", 36, "Hosakote", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("N A Haris", 51, "Shantinagar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Suresh B S", 54, "Hebbal", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("L B P Bheema Naik", 61, "Hagaribommanahalli", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("K Raghavendra Basavaraj Hitnal", 38, "Koppal", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("Tanveer Sait", 54, "Narasimharaja", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Shamanuru Shivashankarappa", 57, "Davanagere South", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("B C Patil", 59, "Hirekerur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("G T Devegowda", 62, "Chamundeshwari", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("H Nagesh", 50, "Mulbagal", "IND", Gender.MALE, false));
		mla.add(new MlaDTO("Narayana Swamy L N", 78, "Devanahalli", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("Ramanagaram", 61, "Ramanagaram", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Lingesh K S", 48, "Belur", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("J K Krishnareddy", 36, "Chintamani", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Bhusanur Ramesh Balappa", 51, "Sindgi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("H D Revanna", 54, "Holenarasipura", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Bandeppa Khasempur", 61, "Bidar South", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("D C Gowrishankar", 38, "Tumkur Rural", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("K Srinivasa Gowda", 54, "Kolar", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("K Mahadeva", 57, "Periyapatna", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Narayana Gowda", 59, "Krishnarajapet", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("S R Mahesh", 62, "Krishnarajanagara", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("K Y Nanjegowda", 50, "Malur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Ashvin Kumar M", 78, "T. Narasipura", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("H D Kumaraswamy", 61, "Channapatna", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("Manjunatha R", 48, "Dasarahalli", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("H Viswanath", 36, "Hunsur", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("H K Kumaraswamy", 51, "Sakaleshpur", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Nadagouda Venkatarao", 54, "Sindhanoor", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Dr K Srinivasamurthy", 61, "Nelamangala", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("Suresh Gowda", 38, "Nagamangala", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("Devanand Fulasing Chavan", 54, "Nagthan", "JDS",Gender.MALE, true));
		mla.add(new MlaDTO("A T Ramaswamy", 57, "Arakalgud", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("K M Shivalinge Gowda", 59, "Arasikere", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("K Gopalaiah", 62, "Mahalakshmi Layout", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("B Satyanarayana", 50, "Sira", "JDS", Gender.MALE, false));
		mla.add(new MlaDTO("S N K M Narayana Swamy", 78, "Bangarpet", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("Pratapagouda Patil", 61, "Maski", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("K R Ramesh Kumar", 48, "Srinivasapur", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("Deshpande Raghunath Vishwanathrao", 36, "Haliyal", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Siddaramaiah", 51, "Badami", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("B Narayan Rao", 54, "Basavakalyan", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("Patil Shivananda Siddaramappa", 61, "Basavana Bagevadi", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Raheem Khan", 38, "Bidar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Eshwara Bhimanna Khandre", 54, "Bhalki", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("B K Sangameshwara", 57, "Bhadravathi", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Yathindra S", 59, "Varuna", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Laxmi R Hebbalkar", 62, "Belgaum Rural", "INC", Gender.FEMALE, false));
		mla.add(new MlaDTO("T Raghumurthy", 50, "Challakere", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("B Nagendra", 78, "Bellary", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("C Puttarangashetty", 61, "Chamarajanagar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("H K Patil", 48, "Gadag", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("D K Shivakumar", 36, "Kanakapura", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("S T Somashekar", 51, "Yeshvanthapura", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("B Shivanna", 54, "Anekal", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Arbail Shivaram Hebbar", 61, "Yellapur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Kaneez Fatima", 38, "Gulbarga Uttar", "INC", Gender.FEMALE, false));
		mla.add(new MlaDTO("V Muniyappa", 54, "Sidlaghatta", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Ramesh Lakshmanrao Jarakiholi", 57, "Gokak", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("N H Shivashankara Reddy", 59, "Gowribidanur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Mahesh Iranagouda Kumathalli", 62, "Athani", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Dr K Sudhakar", 50, "Chikkaballapur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("N Mahesh", 78, "Kollegal", "BSP", Gender.MALE, false));
		mla.add(new MlaDTO("Anand Singh", 61, "Vijayanagara", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("J N Ganesh", 48, "Kampli", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Venkataramanappa", 36, "Pavagada", "INC",Gender.MALE, true));
		mla.add(new MlaDTO("D S Hoolageri", 51, "Lingasagur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Amaregouda Linganagouda Patil Bayyapur", 54, "Kushtagi", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Dr H D Ranganath", 61, "Kunigal", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Shivalli Channabasappa Satyappa", 38, "Kundagol", "INC", Gender.FEMALE, false));
		mla.add(new MlaDTO("R Akhanda Srinivasamurthy", 54, "Pulakeshinagar", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("M Y Patil", 57, "Afzalpur", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Dr G Parameshwara", 59, "Koratagere", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Yashvantarayagouda Vittalagouda Patil", 62, "Indi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Roopakala M", 50, "Kolar Gold Field", "BJP",Gender.FEMALE, true));
		mla.add(new MlaDTO("Dr Anjali Hemant Nimbalkar", 78, "Khanapur", "BJP", Gender.FEMALE, false));
		mla.add(new MlaDTO("Satish Lakshmanrao Jarakiholi", 61, "Yemkanmardi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Munirathna", 48, "Rajarajeshwarinagar", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("T D Rajegowda", 36, "Sringeri", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Shrimanth Balasaheb Patil", 51, "Kagawad", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("B A Basavaraja", 54, "K.R. Pura", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Dr Ajay Dharam Singh", 61, "Jewargi", "INC", Gender.MALE, false));
		mla.add(new MlaDTO("Siddu B Nyamagouda", 38, "Jamakhandi", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Basanagouda Daddal", 54, "Raichur Rural", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("C B Krishna Byregowda", 57, "Byatarayanapura", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Ganesh Prakash Hukkeri", 59, "Chikkodi-Sadalga", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("M Krishnappa", 62, "Vijayanagar", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("S N Subbareddy", 50, "Bagepalli", "BJP",Gender.MALE, true));
		mla.add(new MlaDTO("Jameer Ahmed Khan", 78, "Chamarajpet", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Koujalgi Mahanthesh Shivananda", 61, "Bailhongal", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("P T Parameshwara Naik", 48, "Hadagali", "BJP", Gender.MALE, false));
		mla.add(new MlaDTO("Soumya Reddy", 36, "Jayanagar", "BJP", Gender.FEMALE, false));
		mla.add(new MlaDTO("R Roshan Baig", 51, "Shivajinagar", "BJP", Gender.MALE, false));
		
		System.out.println("Total Elements is: "+mla.size());
		
		System.out.println("---------------------------------------------------");
		System.out.println("All Mla's Which Age is greater than 50...");
		mla.stream()
		.filter(element-> element.getAge() > 50)
		.forEach(element->System.out.println(element.getName()));
	
		System.out.println("------------------------------------------------");
		System.out.println("All Mla's Which Age is less than 50...");
		mla.stream()
		.filter(element-> element.getAge() < 50)
		.forEach(element->System.out.println(element.getName()));
	
		System.out.println("----------------------------------------------");
		System.out.println("All Mla's Which is Male...");
		mla.stream()
		.filter(element-> element.getGender().equals(Gender.MALE)).
		forEach(element->System.out.println(element.getName()));
		
		System.out.println("------------------------------------------------");
		System.out.println("All Mla's Which is Female...");
		mla.stream()
		.filter(element-> element.getGender().equals(Gender.FEMALE))
		.forEach(element->System.out.println(element.getName()));
	
		System.out.println("---------------------------------------------");
		System.out.println("Sorted Collection By Party in asc order...");
		mla.stream()
		.sorted((element1,element2)-> element1.getParty().compareTo(element2.getParty())) 
		.forEach(element->System.out.println(element));
		
		System.out.println("---------------------------------------------");
		System.out.println("Sorted Collection By Name in desc order...");
		mla.stream()
		.sorted((element1,element2)-> element2.getName().compareTo(element1.getName())) 
		.forEach(element->System.out.println(element));
		
		System.out.println("----------------------------------------------");
		System.out.println("Sorted Collection By Age in desc order...");
		mla.stream().
		sorted((element1,element2)-> Double.compare(element2.getAge(), element1.getAge())) 
		.forEach(element->System.out.println(element));
		
		System.out.println("-------------------------------------------------");
		System.out.println("All INC Mla's...");
		mla.stream()
		.filter(element-> element.getParty().equals("INC"))
		.forEach(element->System.out.println(element.getName()));
		
		System.out.println("--------------------------------------------------");
		System.out.println("All Unique Party's... ");
		mla.stream()
		.map(element-> element.getParty())
		.collect(Collectors.toSet())
		.forEach(element->System.out.println(element));
		
		System.out.println("---------------------------------------------------");
		System.out.println("All Independent MLA's...");
		mla.stream()
		.filter(element-> element.isIndependent())
		.forEach(element->System.out.println(element.getName()));
		
		System.out.println("-----------------------------------------------------");
		System.out.println("All Mla's Age greater than 50 And Party is BJP...");
		mla.stream()
		.filter(element-> element.getAge()>50 && element.getParty().equals("BJP"))
		.forEach(element->System.out.println(element.getName()));
		
	}

}
