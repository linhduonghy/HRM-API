package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * The persistent class for the member_traning_cource database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member_traning_cource")
public class MemberTrainingCource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Date training_start_date;

	// bi-directional many-to-one association to TrainingCourse
	@ManyToOne
	@JoinColumn(name = "training_cource_id")
	@JsonIgnoreProperties("memberTraningCources")
	private TrainingCource trainingCource;

	// bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name = "member_id")
	@JsonIgnoreProperties("memberTraningCources")
	private Member member;

}