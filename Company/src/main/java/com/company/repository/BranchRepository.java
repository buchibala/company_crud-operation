package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer>{

	

}
