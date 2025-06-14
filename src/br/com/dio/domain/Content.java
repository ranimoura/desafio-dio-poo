package br.com.dio.domain;

public sealed abstract class Content permits Course, Mentoring {

	protected static final double XP_DEFAULT = 10;

	private String title;
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// A SER IMPLEMENTADO
	public abstract double calculateXp();
}
