package com.beerpongbeer.Demo.repository;

import com.beerpongbeer.Demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
