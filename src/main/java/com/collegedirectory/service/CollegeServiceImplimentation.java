package com.collegedirectory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegedirectory.model.College;
import com.collegedirectory.repository.CollegeRepository;


@Service
public class CollegeServiceImplimentation  implements CollegeService{
	
	@Autowired
	private CollegeRepository collegerepo;
	

	@Override
	public List<College> getAllColleges() {
		
		return collegerepo.findAll();
		
		
		
	}

	@Override
	public College saveCollege(College college) {
		// TODO Auto-generated method stub
		return collegerepo.save(college) ;
	}

	@Override
	public College getCollegeById(Long id) {
		// TODO Auto-generated method stub
		
Optional <College>  optionalcollege=collegerepo.findById(id);
		
		
		return optionalcollege.orElse(null);
	}

	@Override
	public void deleteCollege(Long id) {
		// TODO Auto-generated method stub
		collegerepo.deleteById(id);
		
	}

	@Override
	public College updateCollege(Long id, College collegedetails) {
		
	System.out.println(id);
	System.out.println(collegedetails);
		// TODO Auto-generated method stub
		   
		 College college = collegerepo.findById(id).orElseThrow(() -> new RuntimeException("College not found"));
		 System.out.println(college);
		 college.setName(collegedetails.getName());
		 college.setLocation(collegedetails.getLocation());
		 college.setCourses(collegedetails.getCourses());
		 college.setId(collegedetails.getId());
		 college.setContact(collegedetails.getContact());
		 
		      	
		return collegerepo.save(college);
	}

}
