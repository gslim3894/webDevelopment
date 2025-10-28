package com.exam.gagi.dao;

import java.util.List;

import com.exam.gagi.model.Inquiry;

public interface InquiryDao extends BaseBoardDao<Inquiry> {

	Inquiry getById(int id);

	int getUnansweredCount();

	List<Inquiry> getByUserId(int userId);


}
