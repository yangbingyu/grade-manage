package com.example.grademanage.repository;

import com.example.grademanage.entity.Lessones;
import com.example.grademanage.entity.StudentsLessones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonesRepository extends JpaRepository<Lessones, Integer> {
}
