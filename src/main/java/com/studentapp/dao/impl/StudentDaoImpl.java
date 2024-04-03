package com.studentapp.dao.impl;

import com.studentapp.dao.StudentDao;
import com.studentapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    @Override
    public boolean saveStudent(Student student) {
        hibernateTemplate.save(student);
        return true;
    }

    @Transactional
    @Override
    public boolean updateStudent(Student student) {
        hibernateTemplate.update(student);
        return true;
    }

    @Override
    public Student getStudent(long id) {
        return hibernateTemplate.get(Student.class, id);
    }

    @Transactional
    @Override
    public boolean deleteStudent(long id) {
        Student student = hibernateTemplate.get(Student.class, id);
        hibernateTemplate.delete(student);
        return true;
    }

    @Override
    public List<Student> getAllStudent() {
        return hibernateTemplate.loadAll(Student.class);
    }
}
