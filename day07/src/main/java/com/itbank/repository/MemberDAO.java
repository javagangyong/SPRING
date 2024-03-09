package com.itbank.repository;

import org.springframework.stereotype.Repository;

import com.itbank.model.MemberDTO;

@Repository
public interface MemberDAO {
	
	MemberDTO login(MemberDTO dto);
	
}
