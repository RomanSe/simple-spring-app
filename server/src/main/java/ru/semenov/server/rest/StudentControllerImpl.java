package ru.semenov.server.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.semenov.server.entities.Student;
import ru.semenov.server.services.StudentService;

@RestController()
@RequestMapping("api/v1")
public class StudentControllerImpl implements StudentController {

    @Autowired
    StudentService studentService;

    @Override
    @GetMapping("/students")
    @ResponseBody
    public Iterable<Student>  find(@RequestParam(value = "name", required = false) String name) {
        if (name == null || name.equals(""))
            return studentService.findAll();
        else
            return studentService.findByNameLike(name);
    }

    @Override
    @GetMapping("/students/{id}")
    @ResponseBody
    public Student findById(@PathVariable("id") Long id) {
        return studentService.findById(id).orElse(null);
    }

    @Override
    @DeleteMapping("/students/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        studentService.deleteById(id);
    }

    @Override
    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        studentService.save(student);
    }

}
