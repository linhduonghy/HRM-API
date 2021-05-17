package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the permission database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String permission_name;

	//bi-directional one-to-many association to MemberPermission
	@OneToMany(mappedBy="permission")
	@JsonIgnore
	private List<MemberPermission> memberPermissions;

	public MemberPermission addMemberPermission(MemberPermission memberPermission) {
		getMemberPermissions().add(memberPermission);
		memberPermission.setPermission(this);

		return memberPermission;
	}

	public MemberPermission removeMemberPermission(MemberPermission memberPermission) {
		getMemberPermissions().remove(memberPermission);
		memberPermission.setPermission(null);

		return memberPermission;
	}

}