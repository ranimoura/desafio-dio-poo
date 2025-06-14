package br.com.dio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private int devId;
	private String devName;
	private Set<Content> subscribedContent = new LinkedHashSet<>();
	private Set<Content> completedContent = new LinkedHashSet<>();

	public int getDevId() {
		return devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public Set<Content> getSubscribedContent() {
		return subscribedContent;
	}

	public void setSubscribedContent(Set<Content> subscribedContent) {
		this.subscribedContent = subscribedContent;
	}

	public Set<Content> getCompletedContent() {
		return completedContent;
	}

	public void setCompletedContent(Set<Content> completedContent) {
		this.completedContent = completedContent;
	}

	// IMPLEMENTATIONS:

	public void registerBootcamp(Bootcamp bootcamp) {
		this.subscribedContent.addAll(bootcamp.getContents());
		bootcamp.getRegisteredDevs().add(this);
	}

	public void progress() {
		Optional<Content> content = this.subscribedContent.stream().findFirst();
		if (content.isPresent()) {
			this.completedContent.add(content.get());
			this.subscribedContent.remove(content.get());

		} else {
			System.out.println("Você ainda não se matriculou em nenhum conteúdo!");
		}
	}

	public double calculateTotalXp() {
		return this.completedContent.stream().mapToDouble(Content::calculateXp).sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(devId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return devId == other.devId;
	}

}