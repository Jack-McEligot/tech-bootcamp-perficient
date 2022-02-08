/**
 * 
 */
package com.perficient.techbootcampJackMcEligot.Entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * @author jackson.mceligot
 *
 */

@Entity (name = "person")
public class PersonEntity {
	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String firstname;
	private String lastname;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "person_id")
	private List<IncomeComponentEntity> monthlyTransactions;
	static final Logger testLogger = LogManager.getLogger(PersonEntity.class.getName());
	
	public PersonEntity() {
		firstname = "";
		lastname = "";
	}
	
	public PersonEntity(String fn, String ln) {
		firstname = fn;
		lastname = ln;
	}
	
	public int GetPid() {
//		testLogger.traceEntry();
//		testLogger.error("Did it again!");
//		testLogger.traceExit();
		return pid;
		
	}
	public void SetPid(int newPid) {
		pid = newPid;
	}
	
	public String GetFirstname() {
		return firstname;
	}
	
	public void SetFirstname(String newFirstname) {
		firstname = newFirstname;
	}
	public String GetLastname() {
		return lastname;
	}
	public void SetLastname(String newLastname) {
		lastname = newLastname;
	}
}
