package com.collegedirectory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class College {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String location;
	    private String courses;
	    private String contact;
	    
	    
	    
	    
	    
	    
		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		public College(Long id, String name, String location, String courses, String contact) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.courses = courses;
			this.contact = contact;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getCourses() {
			return courses;
		}
		public void setCourses(String courses) {
			this.courses = courses;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "College [id=" + id + ", name=" + name + ", location=" + location + ", courses=" + courses
					+ ", contact=" + contact + "]";
		}
	    
	    
	    
	    
	    
	    
	

}
