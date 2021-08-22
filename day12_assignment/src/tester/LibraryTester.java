package tester;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import custom_exception.*;

import static com.core.app.BookCategory.valueOf;
import static com.core.app.Book.sdf;

import com.core.app.Book;
import com.core.app.BookCategory;

import custom_exception.BookHandlingException;

import static utils.CollectionUtils.populate;

public class LibraryTester {
	public static void main(String[] args) {
		for(int i = 0;i<1000 ; i++)
			System.out.println("Happy Birthday Sam");
	}

}
