package com.cuder.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


/**
 * The persistent class for the training_course database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="training_course")
public class TrainingCource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String content;

	private int duration;

	private int number_of_attendance;

	private String training_cource_name;

	//bi-directional one-to-many association to MemberTraningCource
	@OneToMany(mappedBy = "trainingCource", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<MemberTrainingCource> memberTraningCources;
}