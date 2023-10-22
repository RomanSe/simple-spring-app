package ru.semenov.server.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.semenov.server.entities.Student;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByName(String name);
    List<Student> findByNameLike(String name);
}
