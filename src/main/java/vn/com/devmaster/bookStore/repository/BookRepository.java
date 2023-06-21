package vn.com.devmaster.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.devmaster.bookStore.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
