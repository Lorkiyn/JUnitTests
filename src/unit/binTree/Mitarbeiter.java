package unit.binTree;

public class Mitarbeiter extends BinTreeModel {
	
	private String value;

	public Mitarbeiter(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public String getString() {
		return value;
	}
	
	public void setString(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
