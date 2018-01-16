package unit.binTree;

public abstract class BinTreeModel {
	
	private int id;

	public BinTreeModel(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id + "";
	}

}
