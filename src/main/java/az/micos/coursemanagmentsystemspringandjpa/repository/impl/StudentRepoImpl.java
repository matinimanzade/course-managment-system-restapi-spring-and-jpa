package az.micos.coursemanagmentsystemspringandjpa.repository.impl;

import az.micos.coursemanagmentsystemspringandjpa.entity.Student;
import az.micos.coursemanagmentsystemspringandjpa.repository.inter.StudentRepoInter;
import jakarta.persistence.EntityManagerFactory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@Setter
@ToString
public class StudentRepoImpl implements StudentRepoInter {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public void create(Student entity) {

    }

    @Override
    public void update(Student entity) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public Student getById(String id) {
        return null;
    }

    @Override
    public Student getAll() {
        return null;
    }
}
