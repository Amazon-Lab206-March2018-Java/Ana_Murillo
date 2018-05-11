package com.anaroja.bookspractice.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.bookspractice.models.Book;

@Service
public class BookService {
	List<Book> books = new ArrayList<Book>(Arrays.asList(
			new Book("The Illiad", "About a war", "Greek", 302),
			new Book("East of Eden", "life in a box", "English", 250),
			new Book("How to read a book", "About reading books", "English", 200)));
	public List<Book> allBooks(){
		return books;
	}
	public Book findBookByIndex(int index) {
		if (index < books.size()){
            return books.get(index);
        }else{
		return null;
        }
	}
	public void addBook(@Valid Book book) {
		 books.add(book);	
	}
	public void updateBook(int id, @Valid Book book) {
		if (id < books.size()){
            books.set(id, book);
        }
		
	}
	public void destroyBook(int id) {
		if (id < books.size()){
            books.remove(id);
        }
		
	}
}
