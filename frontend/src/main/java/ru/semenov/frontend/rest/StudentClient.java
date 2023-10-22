package ru.semenov.frontend.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.semenov.frontend.dto.StudentDTO;

@FeignClient("simple-spring-app-server")
@RequestMapping("/server/api/v1")
public interface StudentClient {
    @GetMapping("/students")
    @ResponseBody
    Iterable<StudentDTO> find(@RequestParam(value = "name", required = false) String name);

    @GetMapping("/students/{id}")
    @ResponseBody
    StudentDTO findById(@PathVariable("id") Long id);


    @DeleteMapping("/students/{id}")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/students/{id}")
    void updateStudent(@PathVariable("id") Long id, @RequestBody StudentDTO student);


}
