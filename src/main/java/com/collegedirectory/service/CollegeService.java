package com.collegedirectory.service;

import java.util.List;


import com.collegedirectory.model.College;


public interface CollegeService {
	
	
	public List<College> getAllColleges();
    public College saveCollege(College college);
    public College getCollegeById(Long id);
    public void deleteCollege(Long id);
    public College updateCollege(Long id, College college);
	
	

}
