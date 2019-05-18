
public class BookShelf implements Aggregate{

	private Book[] books;
	
	private int last = 0;

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
	
}
