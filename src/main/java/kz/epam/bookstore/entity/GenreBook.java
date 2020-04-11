package kz.epam.bookstore.entity;

public class GenreBook {
    private Integer genreId;
    private Integer bookId;

    public GenreBook(Integer authorId, Integer bookId) {
        this.genreId = authorId;
        this.bookId = bookId;
    }

    public GenreBook(){}

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer authorId) {
        this.genreId = authorId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}
