package br.com.dio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private int bootcampId;
	private String bootcampName;
	private String description;
	private final LocalDate startDate = LocalDate.now();
	private final LocalDate endDate = startDate.plusDays(45);
	private Set<Dev> registeredDevs = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();

	public int getBootcampId() {
		return bootcampId;
	}

	public void setBootcampId(int bootcampId) {
		this.bootcampId = bootcampId;
	}

	public String getBootcampName() {
		return bootcampName;
	}

	public void setBootcampName(String bootcampName) {
		this.bootcampName = bootcampName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Dev> getRegisteredDevs() {
		return registeredDevs;
	}

	public void setRegisteredDevs(Set<Dev> registeredDevs) {
		this.registeredDevs = registeredDevs;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bootcampId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return bootcampId == other.bootcampId;
	}

}
