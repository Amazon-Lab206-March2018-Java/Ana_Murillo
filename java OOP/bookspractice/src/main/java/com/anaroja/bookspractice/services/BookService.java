package com.anaroja.bookspractice.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.bookspractice.models.Book;
import com.anaroja.bookspractice.repositories.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

	public List<Book> allBooks(){
        return bookRepository.findAll();
	}
	public Book findBookById(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	}
	public void addBook(@Valid Book book) {
		bookRepository.save(book);
	}
	public void updateBook(@Valid Book book) {
		bookRepository.save(book);
		
	}
	public void destroyBook(Long id) {
		bookRepository.deleteById(id);
	}
}
