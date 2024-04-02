package com.studentapp.dao.impl;

import com.studentapp.dao.StudentDao;
import com.studentapp.entity.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public boolean saveStudent(Student student) {
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {
        return false;
    }

    @Override
    public Student getStudent(long id) {
        return null;
    }

    @Override
    public boolean deleteStudent(long id) {
        return false;
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }
}
