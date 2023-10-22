package ru.semenov.server.rest;

import org.springframework.web.bind.annotation.*;
import ru.semenov.server.entities.Student;

public interface StudentController {
    @GetMapping("/students")
    @ResponseBody
    Iterable<Student> find(@RequestParam(value = "name", required = false) String name);

    @GetMapping("/students/{id}")
    @ResponseBody
    Student findById(@PathVariable("id") Long id);

    @DeleteMapping("/students/{id}")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/students/{id}")
    void updateStudent(@PathVariable("id") Long id, @RequestBody Student student);
}
