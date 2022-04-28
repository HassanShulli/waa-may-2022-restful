package com.example.phase2.dto;

import com.example.phase2.entity.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentGpaDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<CourseDto> coursesTaken;
    private float gpa;
}
