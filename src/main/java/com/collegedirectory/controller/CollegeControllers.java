package com.collegedirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collegedirectory.model.College;
import com.collegedirectory.service.CollegeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/colleges")
public class CollegeControllers
{
	
 @Autowired	
  private CollegeService collegeservice;
	
	// Get all colleges
 
    @GetMapping("/getallcolleges")
    public List<College> getAllColleges() {
        return collegeservice.getAllColleges();
    }

    // Create a new college
    
   
    @PostMapping("/createcollege")
    public College createCollege(@RequestBody College college) {
        return collegeservice.saveCollege(college);
    }

    
    // Get a college by ID
    @GetMapping("/getcollegebyid/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable Long id) {
        College college = collegeservice.getCollegeById(id);
        if (college != null) {
            return ResponseEntity.ok(college);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Update an existing college
    
    @PutMapping("/updatecollegebyid/{id}")
    public ResponseEntity<College> updateCollege(
    		@RequestBody College college,
    		@PathVariable Long id
    		)
    {
        College updatedCollege = collegeservice.updateCollege(id, college);
        if (updatedCollege != null) {
            return ResponseEntity.ok(updatedCollege);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a college
    
    @DeleteMapping("/deletecollegebyid/{id}")
    public ResponseEntity<Void> deleteCollege(@PathVariable Long id) {
        collegeservice.deleteCollege(id);
        return ResponseEntity.noContent().build();
    }
}
	
	
	
