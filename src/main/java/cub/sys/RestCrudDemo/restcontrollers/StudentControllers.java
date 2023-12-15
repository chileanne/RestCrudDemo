package cub.sys.RestCrudDemo.restcontrollers;


import cub.sys.RestCrudDemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentControllers {


    private List<Student> theStudents;

    @PostConstruct
    public void add(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("solomon", "akin"));
        theStudents.add(new Student("tony", "wales"));
        theStudents.add(new Student("tory", "lanes"));
        theStudents.add(new Student("precious", "precious"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
//
//        List<Student> theStudents = new ArrayList<>();
//
//        theStudents.add(new Student("solomon", "akin"));
//        theStudents.add(new Student("tony", "wales"));
//        theStudents.add(new Student("tory", "lanes"));
//        theStudents.add(new Student("precious", "precious"));

        return  theStudents;
    }


    @GetMapping("/students/{studentId}")
    public  Student  getStudent(@PathVariable int studentId){
        return  theStudents.get(studentId);
    }
}
