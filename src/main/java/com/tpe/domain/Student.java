package com.tpe.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name="t_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Isim kismi bos olamaz")
    private String firstName;
    @NotEmpty(message = "Soyisim kismi bos olamaz")
    private String lastName;
    @NotNull(message = "Lutfen puan bilgisini giriniz..")
    private Integer grade;

    private LocalDateTime createDate = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", createDate=" + createDate +
                '}';
    }
}
