package com.company.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee  {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer empid;
	public String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id",referencedColumnName = "empid")
	public List<Branch> branch;

	public Employee() {
		
	}
	
	public Employee(String name, List<Branch> branch) {
		super();
		this.name = name;
		this.branch = branch;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", branch=" + branch + "]";
	}

	


	
	
}
