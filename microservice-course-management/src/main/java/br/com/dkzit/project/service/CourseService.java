package br.com.dkzit.project.service;

import br.com.dkzit.project.model.Course;
import br.com.dkzit.project.model.Transaction;

import java.util.List;


public interface CourseService {
    List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}
