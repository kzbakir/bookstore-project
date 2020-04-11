package kz.epam.bookstore.entity;

public class AuthorBook {
    private Integer authorId;
    private Integer bookId;

    public AuthorBook(Integer authorId, Integer bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

    public AuthorBook(){}

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}
