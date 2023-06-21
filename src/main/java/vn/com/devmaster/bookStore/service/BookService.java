package vn.com.devmaster.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.devmaster.bookStore.controller.BookController;
import vn.com.devmaster.bookStore.entity.Book;
import vn.com.devmaster.bookStore.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    public void save(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }

    public Book getBookById(int id){
        return bookRepository.findById(id).get();
    }
    public void deleteById(int id){
        bookRepository.deleteById(id);
    }
}
