package com.xworkz.mla.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.mla.constant.Gender;

public class MlaDTO implements Serializable {

	private String name, constituency, party;
	private double age;
	private Gender gender;
	private boolean independent;
	
	public MlaDTO() {
		System.out.println("no-arg constructor");
	}

	public MlaDTO(String name, double age, String constituency, String party,  Gender gender, boolean independent) {
		super();
		this.name = name;
		this.constituency = constituency;
		this.party = party;
		this.age = age;
		this.gender = gender;
		this.independent = independent;
	}

	@Override
	public String toString() {
		return "MlaDTO [name=" + name + ", constituency=" + constituency + ", party=" + party + ", age=" + age
				+ ", gender=" + gender + ", independent=" + independent + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, constituency, gender, independent, name, party);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MlaDTO)) {
			return false;
		}
		MlaDTO other = (MlaDTO) obj;
		return Double.doubleToLongBits(age) == Double.doubleToLongBits(other.age)
				&& Objects.equals(constituency, other.constituency) && gender == other.gender
				&& independent == other.independent && Objects.equals(name, other.name)
				&& Objects.equals(party, other.party);
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getName() {
		return name;
	}

	public String getConstituency() {
		return constituency;
	}

	public String getParty() {
		return party;
	}

	public double getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public boolean isIndependent() {
		return independent;
	}

}
