package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.OsTypeSupported;
import com.xworkz.application.constant.Type;

public class ApplicationDTO  implements Serializable {

	private String name, developedBy;
	private double version, size, price, minProcessorSpeed, minRamSpaceRequired, ageLimit, rating;
	private Type type;
	private OsTypeSupported osTypeSupportsd;
	private LangUsed langUsed;
	private LocalDate createdDate, firstVersionReleaseDate, currentVersionReleaseDate, nextVersionReleaseDate ;
	private boolean internetNeeded;
	private int noOfDownloads,trialDays;

	public ApplicationDTO() {
		System.out.println("no-arg Constructor in ApplicationDTO ");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}


	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}


	public double getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}


	public void setMinRamSpaceRequired(double minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}


	public double getAgeLimit() {
		return ageLimit;
	}


	public void setAgeLimit(double ageLimit) {
		this.ageLimit = ageLimit;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public OsTypeSupported getOsTypeSupportsd() {
		return osTypeSupportsd;
	}


	public void setOsTypeSupportsd(OsTypeSupported osTypeSupportsd) {
		this.osTypeSupportsd = osTypeSupportsd;
	}


	public LangUsed getLangUsed() {
		return langUsed;
	}


	public void setLangUsed(LangUsed langUsed) {
		this.langUsed = langUsed;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}


	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}


	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}


	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}


	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}


	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}


	public boolean isInternetNeeded() {
		return internetNeeded;
	}


	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}


	public int getNoOfDownloads() {
		return noOfDownloads;
	}


	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}


	public int getTrialDays() {
		return trialDays;
	}


	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createdDate, currentVersionReleaseDate, developedBy, firstVersionReleaseDate,
				internetNeeded, langUsed, minProcessorSpeed, minRamSpaceRequired, name, nextVersionReleaseDate,
				noOfDownloads, osTypeSupportsd, price, rating, size, trialDays, type, version);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Double.doubleToLongBits(ageLimit) == Double.doubleToLongBits(other.ageLimit)
				&& Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetNeeded == other.internetNeeded && langUsed == other.langUsed
				&& Double.doubleToLongBits(minProcessorSpeed) == Double.doubleToLongBits(other.minProcessorSpeed)
				&& Double.doubleToLongBits(minRamSpaceRequired) == Double.doubleToLongBits(other.minRamSpaceRequired)
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& noOfDownloads == other.noOfDownloads && osTypeSupportsd == other.osTypeSupportsd
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size) && trialDays == other.trialDays
				&& type == other.type && Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}


	


	

	
}
