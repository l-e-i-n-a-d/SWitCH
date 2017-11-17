package aula20171107;

import java.time.LocalDate;

public class Task {

	private String description;
	private LocalDate dateOfCreation;
	private LocalDate dateOfConclusion;

	public Task(String description, LocalDate dateOfCreation) {
		this.description = description;
		this.dateOfCreation = dateOfCreation;
	}

	public boolean isDone() {
		if (dateOfConclusion != null) return true;
		return false;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateOfCreation() {
		return dateOfCreation;
	}

	public LocalDate getDateOfConclusion() {
		return dateOfConclusion;
	}

	public void setDateOfConclusion(LocalDate dateOfConclusion) {
		this.dateOfConclusion = dateOfConclusion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfCreation == null) ? 0 : dateOfCreation.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Task other = (Task) obj;
		if (dateOfCreation == null) {
			if (other.dateOfCreation != null) {
				return false;
			}
		} else if (!dateOfCreation.equals(other.dateOfCreation)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		return true;
	}

}
