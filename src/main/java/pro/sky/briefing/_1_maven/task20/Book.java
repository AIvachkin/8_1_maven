package pro.sky.briefing._1_maven.task20;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Book {

//    Есть таблица book с колонками name и author_id и таблица author
//    с колонками id и name. Вывести все книги определенного автора (author.name)


    @Id
    private Long id;

    private Long authorId;

    private String name;


    public Book(String name) {
        this.name = name;
    }

    public Book() {

    }


    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(authorId, book.authorId) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, name);
    }
}
