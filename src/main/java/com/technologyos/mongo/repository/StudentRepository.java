package com.technologyos.mongo.repository;

import com.technologyos.mongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
   List<Student> findByEmail(String email);
}
