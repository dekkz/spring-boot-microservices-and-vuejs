package br.com.dkzit.project.service;

import br.com.dkzit.project.repository.CourseRepository;
import br.com.dkzit.project.repository.TransactionRepository;
import br.com.dkzit.project.model.Course;
import br.com.dkzit.project.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl  implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Course> allCourses(){
        return courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long courseId){
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public List<Transaction> findTransactionsOfUser(Long userId){
        return transactionRepository.findAllByCourseId(userId);
    }

    @Override
    public List<Transaction> findTransactionsOfCourse(Long courseId){
        return transactionRepository.findAllByCourseId(courseId);
    }

    @Override
    public Transaction saveTransaction(Transaction transaction){
        return  transactionRepository.save(transaction);
    }
}
