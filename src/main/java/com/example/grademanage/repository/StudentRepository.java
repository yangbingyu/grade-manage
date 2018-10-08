package com.example.grademanage.repository;

import com.example.grademanage.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {

    List<Students> findStudentsBySId(int sid);
}
