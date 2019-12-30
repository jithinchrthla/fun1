package com.money.demo.repository;

import com.money.demo.model.TestCases;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<TestCases, String> {

    TestCases findByAuthor(String author);
    
    List<TestCases> deleteBytopicAndAuthor(String title, String author);
}