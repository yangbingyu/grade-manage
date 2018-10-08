package com.example.grademanage.repository;

import com.example.grademanage.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,String> {
}
