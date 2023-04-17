package jm.study.extend.swagger.controller;

import io.swagger.annotations.ApiOperation;
import jm.study.extend.swagger.dto.StudentDto;
import jm.study.extend.swagger.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

@RestController
public class SwaggerController {

    @PersistenceContext
    private EntityManager em;

    @GetMapping("/v1/api/student/{seq}")
    @Transactional
    @ApiOperation(value = "사용자 정보 조회", notes = "seq 이용하여 사용자 정보를 조회합니다.")
    public StudentDto getStudent(@PathVariable("seq") Long seq){
        Student s = new Student();
        s.setName("김종민");
        s.setAge(40);
        em.persist(s);

        Optional<Student> student = Optional.ofNullable(em.find(Student.class,999L));
        return new StudentDto(student.orElseGet(Student::new));
    }
}
