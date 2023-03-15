package com.xworkz.weapon.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.weapon.constant.Type;

public class WeaponDTO implements Serializable{
	
	private String name,material,medeBy,manufacturedBy,usedBy,usedFor;
	private double cost,weight;
	private int id;
	private Type type;
	private LocalDate manufacturedYear;

	public WeaponDTO() {
		System.out.println("no-arg constructor from WeaponDTO....");
	}

	public WeaponDTO(String name, String material, String medeBy, String manufacturedBy, String usedBy, String usedFor,
			double cost, double weight, int id, Type type, LocalDate manufacturedYear) {
		super();
		this.name = name;
		this.material = material;
		this.medeBy = medeBy;
		this.manufacturedBy = manufacturedBy;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.cost = cost;
		this.weight = weight;
		this.id = id;
		this.type = type;
		this.manufacturedYear = manufacturedYear;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", material=" + material + ", medeBy=" + medeBy + ", manufacturedBy="
				+ manufacturedBy + ", usedBy=" + usedBy + ", usedFor=" + usedFor + ", cost=" + cost + ", weight="
				+ weight + ", id=" + id + ", type=" + type + ", manufacturedYear=" + manufacturedYear + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, manufacturedBy, manufacturedYear, material, medeBy, name, type, usedBy, usedFor,
				weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(manufacturedBy, other.manufacturedBy)
				&& Objects.equals(manufacturedYear, other.manufacturedYear) && Objects.equals(material, other.material)
				&& Objects.equals(medeBy, other.medeBy) && Objects.equals(name, other.name) && type == other.type
				&& Objects.equals(usedBy, other.usedBy) && Objects.equals(usedFor, other.usedFor)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMedeBy() {
		return medeBy;
	}

	public void setMedeBy(String medeBy) {
		this.medeBy = medeBy;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(LocalDate manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}
	
	
}
