package com.example.grademanage.repository;

import com.example.grademanage.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers,Integer> {


}
