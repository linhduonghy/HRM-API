package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

	@Temporal(TemporalType.DATE)
	private Date training_start_date;

	// bi-directional many-to-one association to TrainingCourse
	@ManyToOne
	@JoinColumn(name = "training_cource_id")
	private TrainingCource trainingCource;

	// bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

}