package com.example.grademanage.repository;

import com.example.grademanage.entity.StudentsLessones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentLessonesRepositiry extends JpaRepository<StudentsLessones,Integer> {

    @Modifying
    @Query(value = "select lessones.l_name,lessones.l_credit,students_lessones.* from students, students_lessones,lessones where students.s_id = students_lessones.s_id and lessones.l_id = students_lessones.l_id and students_lessones.s_id = ?1", nativeQuery = true)
    List<StudentsLessones> findScoreBySId(int SId);

    @Modifying
    @Query(value = "select lessones.l_name,lessones.l_credit,students_lessones.* from students, students_lessones,lessones where students.s_id = students_lessones.s_id and lessones.l_id = students_lessones.l_id and students_lessones.s_id =?1 and lessones.l_name like ?2", nativeQuery = true)
    List<StudentsLessones> findScoreBySIdAndLessones(int SId,String lName);

    @Modifying
    @Query(value = "select lessones.l_name,lessones.l_credit,students_lessones.* from students, students_lessones,lessones where students.s_id = students_lessones.s_id and lessones.l_id = students_lessones.l_id and students_lessones.s_id =?1 and students_lessones.score < 60", nativeQuery = true)
    List<StudentsLessones> findScoreBySIdPass(int SId);

    @Modifying
    @Query(value = "select lessones.l_name,lessones.l_credit,students_lessones.* from students, students_lessones,lessones where students.s_id = students_lessones.s_id and lessones.l_id = students_lessones.l_id and students_lessones.s_id =?1 and students_lessones.score < 60 and lessones.l_name like ?2", nativeQuery = true)
    List<StudentsLessones> findScoreBySIdPassAndLessones(int SId,String lName);
}
