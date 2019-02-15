package com.qa.persistence.domain;

import java.lang.reflect.Array;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Column(length = 6)
	private Long classroomId;
	@Column(length = 40)
	private String trainer;
	
	private String trainees;
	
	public Classroom() {
	}
	
	public Classroom(String trainer, String trainees) {
		super();
		this.trainer = trainer;
		this.trainees = trainees;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTrainees() {
		return trainees;
	}

	public void setTrainees(String trainees) {
		this.trainees = trainees;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	

	

	
}
