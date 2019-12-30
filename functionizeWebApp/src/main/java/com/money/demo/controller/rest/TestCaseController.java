package com.money.demo.controller.rest;

import com.money.demo.model.TestCases;
import com.money.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("functionize")
public class TestCaseController {
@Autowired
    TestRepository testRepository;

    @PostMapping("/testCase")
    public TestCases addBlogPost(@RequestBody TestCases newBlog) {
        return testRepository.save(newBlog);
    }

    @GetMapping("/testCases/{id}")
    public Optional<TestCases> getBlog(@PathVariable String id) {
        if (testRepository.existsById(id)) {
            return testRepository.findById(id);
        } else
            return Optional.empty();
    }

    @GetMapping("/testCases/count")
    public long countTotalTestCases() {
        return testRepository.count();
    }

}
