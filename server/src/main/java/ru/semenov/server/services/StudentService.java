package ru.semenov.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import ru.semenov.server.entities.Student;
import ru.semenov.server.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> findByNameLike(String name) {
        return studentRepository.findByNameLike('%' + name + '%');
    }

    public Iterable<Student> findAll(Sort sort) {
        return studentRepository.findAll(sort);
    }

    public Page<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    public <S extends Student> S save(S entity) {
        return studentRepository.save(entity);
    }

    public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
        return studentRepository.saveAll(entities);
    }

    public Optional<Student> findById(Long aLong) {
        return studentRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return studentRepository.existsById(aLong);
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public Iterable<Student> findAllById(Iterable<Long> longs) {
        return studentRepository.findAllById(longs);
    }

    public long count() {
        return studentRepository.count();
    }

    public void deleteById(Long aLong) {
        studentRepository.deleteById(aLong);
    }

    public void delete(Student entity) {
        studentRepository.delete(entity);
    }

    public void deleteAll(Iterable<? extends Student> entities) {
        studentRepository.deleteAll(entities);
    }

    public void deleteAll() {
        studentRepository.deleteAll();
    }
}
