package net.viralpatel.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.persistence.CascadeType;

@Entity
@Table(name="MEETING")
public class Meeting {

	@Id
	@Column(name="MEETING_ID")
	@GeneratedValue
	private Long meetingId;

	@Column(name="SUBJECT")
	private String subject;
	
	@Column(name="MEETING_DATE")
	private Date meetingDate;
	
	@ManyToMany(mappedBy="meetings")	
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Meeting(){
		
	}
	
	public Meeting(String subject) {
		this.subject = subject;
		this.meetingDate = new Date();
	}
	
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

}
