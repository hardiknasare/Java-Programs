package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import static utils.CollectionUtils.populateBooks;

import com.core.app.Book;

public interface IoUtils {
	
	static void storeData(Map<Integer, Book> books, String filename) throws IOException {
		try( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)) ) {
			out.writeObject(books);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	static Map<Integer, Book> restoreData(String fileName) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<Integer, Book>) in.readObject();
		} catch(Exception e) {
			e.printStackTrace();;
		}
		return populateBooks();
	}
	
}
