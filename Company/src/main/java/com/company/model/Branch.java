package com.company.model;

import java.io.Serializable;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author balar
 *
 */
@Entity
@Table(name="branch")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Branch{
	
	@Id
	public Integer branchid;
	public String branchname;
	
	public Branch() {
		
	}
	public Branch(String branchname) {
		super();
		this.branchname = branchname;
	}
	public Integer getBranchid() {
		return branchid;
	}
	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	@Override
	public String toString() {
		return "Branch [branchid=" + branchid + ", branchname=" + branchname + "]";
	}
	
	
	
	
	
	
	

}
