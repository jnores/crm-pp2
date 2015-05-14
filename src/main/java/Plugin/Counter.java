package Plugin;

class Counter implements IdGenerator
{
	private long count = 0;
	public synchronized Long nextId() {
		return new Long(count++);
	}
	@Override
	public long nextID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}