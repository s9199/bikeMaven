package Manager;

public interface IManager <TEntity> {
	public void createTable();
	public void dropTable();
	public void delete();
	public void insert();
	public void update();
	public void select();
}
