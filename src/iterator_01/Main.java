package iterator_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-legs"));
		
		Iterator it = (Iterator) bookShelf.iterator();
		
		while (it.hasNext()) {
			Book book=(Book)it.next();
			System.out.println(book.getName());
		}

	}

}
