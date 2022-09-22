package com.springboot.bookstore.service;

import com.springboot.bookstore.constants.Category;
import com.springboot.bookstore.domain.Book;
import com.springboot.bookstore.service.dto.BookDto;
import com.springboot.bookstore.service.dto.SellDto;

import java.util.List;

public interface BookStoreService {
    void addNewBook(BookDto bookDto);

    Book addBook(Integer id, int quantityToAdd);

    BookDto getBookById(Integer id);

    List<BookDto> getAllBooks();

    int getNumberOfBooksById(Integer id);

    Book updateBook(Integer id, BookDto bookDto);

    void sellBook(Integer id);

    void sellBooks(List<SellDto> sellDtos);
    void deleteBook(Book bookDto);

    List<BookDto> getBookByCategoryKeyWord(String keyword, Category category);

    int getNumberOfBooksSoldByCategoryAndKeyword(String keyword, Category category);

}
