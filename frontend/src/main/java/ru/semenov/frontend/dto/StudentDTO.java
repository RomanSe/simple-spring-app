package ru.semenov.frontend.dto;

public class StudentDTO {

    private Long id;

    private String name;

    private Integer mark;

    public StudentDTO(String name, Integer mark) {
        this.name = name;
        this.mark = mark;
    }

    public StudentDTO() {

    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
