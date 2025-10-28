package com.exam.gagi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.exam.gagi.dao.MemberDao;
import com.exam.gagi.model.Member;
import com.exam.gagi.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public Member login(String email, String password) {
		Member member = memberDao.findByEmail(email);
//		if(member != null && BCrypt.checkpw(password, member.getPassword())) {
			return member;			
//		}
//		return null;
	}
	

	@Override
	public boolean checkId(String userid) {	
		return memberDao.checkId(userid) == 0; // 0�̸� ��� ����
	}

	@Override
	public boolean checkNm(String nickname) {
		return memberDao.checkNm(nickname) == 0; // 0�̸� ��� ����
	}


	@Override
	public void insertMember(Member member) {
		memberDao.insertMember(member);
	}

	@Override
	public Member findByEmail(String email) {
		return memberDao.findByEmail(email);
	}

}
