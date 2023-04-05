package com.xworkz.animal.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.constant.AnimalType;

public class AnimalDTO implements Serializable{
	
	private String name, color;
	private AnimalType type;
	private int lifeSpan;
	private double weight, height;
	
	public AnimalDTO() {
		System.out.println("no-arg constructor from AnimalDTO");
	}

	public AnimalDTO(String name, String color, AnimalType type, int lifeSpan, double weight, double height) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public AnimalType getType() {
		return type;
	}

	public void setType(AnimalType type) {
		this.type = type;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, height, lifeSpan, name, type, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AnimalDTO)) {
			return false;
		}
		AnimalDTO other = (AnimalDTO) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& lifeSpan == other.lifeSpan && Objects.equals(name, other.name) && type == other.type
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "AnimalDTO [name=" + name + ", color=" + color + ", type=" + type + ", lifeSpan=" + lifeSpan
				+ ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	

}
