package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the member_permission database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="member_permission")
public class MemberPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

	//bi-directional many-to-one association to Permission
	@ManyToOne
	@JoinColumn(name = "permission_id")
	private Permission permission;
}