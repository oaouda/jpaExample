package edu.uco.hsung.beans;

import edu.uco.hsung.entity.Book;
import edu.uco.hsung.jpaejb.BookFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value = "bookController")
@SessionScoped
public class BookController  implements Serializable {
    @EJB
    BookFacade bookFacade;
    
    @Inject
    BookBean bookBean;
    
    // Select all the records in the database through BookFacade, when execute select * instruction
    public List<Book> getAll() {
        return bookFacade.findAll();        
    }
    
    public int count() {
        return bookFacade.count();
    }
    
    public void delete(Book b) {
        bookFacade.remove(b);
    }
    
    public String add() {
        Book book = new Book();
        book.setAuthor(bookBean.getAuthor());
        book.setPrice(bookBean.getPrice());
        book.setPubyear(bookBean.getPubyear());
        book.setTitle(bookBean.getTitle());        
        bookFacade.create(book);    
        
        return "index";
    }
    
    public String edit(Book b) {
        bookBean.setId(b.getId());
        bookBean.setAuthor(b.getAuthor());
        bookBean.setPrice(b.getPrice());
        bookBean.setPubyear(b.getPubyear());
        bookBean.setTitle(b.getTitle());
        
        return "update"; // update jsf page
    }
    
    public String save() {
        Book b = new Book(bookBean.getId());
        b.setAuthor(bookBean.getAuthor());
        b.setPrice(bookBean.getPrice());
        b.setPubyear(bookBean.getPubyear());
        b.setTitle(bookBean.getTitle());
        
        bookFacade.edit(b);
        return "index";
    }
    
}
