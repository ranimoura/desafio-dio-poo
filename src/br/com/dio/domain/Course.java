package br.com.dio.domain;

public final class Course extends Content {

	private int workload;

	public Course() {

	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public double calculateXp() {

		return XP_DEFAULT + workload;
	}

}
