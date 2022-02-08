/**
 * 
 */
package com.perficient.techbootcampJackMcEligot.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author jackson.mceligot
 *
 */
@Entity (name = "income_component")
public class IncomeComponentEntity {
	private boolean isExpense;
	private int amount;
	private String title;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long iid;
	private long pid;
	
	public IncomeComponentEntity() {
		isExpense = false;
		amount = 0;
	}
	public IncomeComponentEntity(int number, boolean expense) {
		isExpense = expense;
		amount = number;
	}
	public IncomeComponentEntity(int amount, String title, long pid) {
		this.amount = amount;
		this.title = title;
		this.pid = pid;
		if (amount < 0) isExpense = true; else isExpense = false;
	}
	public long GetPid() {
		return pid;
	}
	public void SetPid(long newPid) {
		pid = newPid;
	}
	public long GetIid() {
		return iid;
	}
	public void SetIid(long newIid) {
		iid = newIid;
	}
	public String GetTitle() {
		return title;
	}
	public void SetTitle(String s) {
		title = s;
	}
	public void SetAmount(int aNumber) {
		amount = aNumber;
	}
	public int GetAmount() {
		return amount;
	}
	public boolean GetIsExpense() {
		return isExpense;
	}
}
