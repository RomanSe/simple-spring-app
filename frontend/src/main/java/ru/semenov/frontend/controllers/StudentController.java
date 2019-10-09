package ru.semenov.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.semenov.frontend.dto.StudentDTO;
import ru.semenov.frontend.rest.StudentClient;

@Controller
public class StudentController {

    @Autowired
    StudentClient studentClient;

    @GetMapping("/students")
    public String showStudents(Model model,
                               @RequestParam(value = "name", required = false) String name
    ) {
        Iterable<StudentDTO> students;
        if (name != null) {
            students = studentClient.find(name);
        } else {
            students = studentClient.find(null);
        }
        model.addAttribute("students", students);
        model.addAttribute("name", name);

        return "students";
    }

}
