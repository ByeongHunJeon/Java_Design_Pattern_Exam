package iterator_01;

public class BookShelfIterator implements Iterator{
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
		this.index=0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (index < bookShelf.getLength()) {
			
			return true;
		}else {
			return false;
		}
			
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

	
}
