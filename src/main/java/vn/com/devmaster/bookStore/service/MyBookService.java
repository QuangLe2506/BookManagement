package vn.com.devmaster.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.devmaster.bookStore.entity.MyBookList;
import vn.com.devmaster.bookStore.repository.MyBookRepository;

import java.util.List;

@Service
public class MyBookService {

    @Autowired
    private MyBookRepository myBookRepository;
    public void saveMyBook(MyBookList myBookList){
        myBookRepository.save(myBookList);
    }
    public List<MyBookList> getAllMyBooks(){
        return myBookRepository.findAll();
    }
    public void deleteById(int id){
        myBookRepository.deleteById(id);
    }
}
