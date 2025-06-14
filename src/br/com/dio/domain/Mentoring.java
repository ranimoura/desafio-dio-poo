package br.com.dio.domain;

import java.time.LocalDate;

public final class Mentoring extends Content {

	private LocalDate date;

	public Mentoring() {

	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public double calculateXp() {

		return XP_DEFAULT + 20d;
	}

}
