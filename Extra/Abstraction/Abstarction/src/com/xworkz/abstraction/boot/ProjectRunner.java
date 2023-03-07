package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.things.Admin;
import com.xworkz.abstraction.things.Project;
public class ProjectRunner {

	public static void main(String[] args) {
		
		Project pro = new Admin();
		pro.name();
		pro.type();
		pro.purpose();
	}

}
