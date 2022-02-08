/**
 * 
 */
package Domain;
/**
 * @author jackson.mceligot
 *
 */
public class IncomeComponent {
	private boolean isExpense;
	private int amount;
	private String title;
	private long iid;
	private long pid;
	
	public IncomeComponent() {
		isExpense = false;
		amount = 0;
	}
	public IncomeComponent(long pid, String title, int amount) {
		this.pid = pid;
		this.title = title;
		this.amount = amount;
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
	public IncomeComponent(int number, boolean expense) {
		isExpense = expense;
		amount = number;
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
