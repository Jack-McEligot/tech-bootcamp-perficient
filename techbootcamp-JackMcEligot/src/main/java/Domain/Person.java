/**
 * 
 */
package Domain;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * @author jackson.mceligot
 *
 */


public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private long pid;
	private String firstname;
	private String lastname;
	private List<IncomeComponent> monthlyTransactions;
	static final Logger testLogger = LogManager.getLogger(Person.class.getName());
	
	public Person() {
		firstname = "testing";
		lastname = "constructor";
	}
	
	public String toString() {
		return String.format("{\"pid\": %d, \"fn\": \"%s\", \"ln\": \"%s\"}", pid, firstname, lastname);
	}
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Person(long pid, String firstname, String lastname) {
		this.pid = pid;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public long GetPid() {
		testLogger.traceEntry();
		testLogger.error("Did it again!");
		testLogger.traceExit();
		return pid;
		
	}
	public void SetPid(long newPid) {
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
