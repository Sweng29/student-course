package com.dummy.course.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "teacher_courses")
@Builder
@Getter
@Setter
@ToString
public class TeacherCourse implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id")
    private Teacher teacher;
    @Id
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;

    @Column(name = "allocation_date")
    private Date allocationDate;

    @Column(name = "allocation_up_to_date")
    private Date allocationUpToDate;

}
