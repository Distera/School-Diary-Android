package com.example.schooldiaryandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.openapitools.client.apis.GradesApi
import org.openapitools.client.apis.StudentsApi
import org.openapitools.client.apis.SubjectsApi
import org.openapitools.client.apis.TeachersApi
import org.openapitools.client.models.GradeDto
import org.openapitools.client.models.GradeMinDto
import org.openapitools.client.models.StudentDto

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val arguments = intent.extras
        val pach = "http://192.168.1.36:5000"

        val apiInstanceGrades = GradesApi(pach)
        val apiInstanceStudents = StudentsApi(pach)
        val apiInstanceSubjects = SubjectsApi(pach)
        val apiInstanceTeachers = TeachersApi(pach)

        val student : StudentDto = apiInstanceStudents.studentsIdGet(arguments!!["id"] as Int)
        val grades = student.gradesIds!!.map{
            apiInstanceGrades.gradesIdGet(it)
        }

        val stk = findViewById<View>(R.id.textView) as TextView
        stk.text = "${student.firstName} ${student.middleName}"

        val gradeDtoTableLayout = findViewById<View>(R.id.tableLayout) as TableLayout
        gradeDtoTableLayout.addView(TableRow(this).also {
            it.addView(TextView(this).apply { text = " Предмет " })
            it.addView(TextView(this).apply { text = " Оценка " })
            it.addView(TextView(this).apply { text = " Учитель " })
        })
        grades.forEach { grade ->
            gradeDtoTableLayout.addView(TableRow(this).also {
                it.addView(TextView(this).apply { text = apiInstanceSubjects.subjectsIdGet(grade.subjectId as Int).name})
                it.addView(TextView(this).apply { text = grade.value.toString() })
                it.addView(TextView(this).apply {
                    val teacher = apiInstanceTeachers.teachersIdGet(grade.teacherId as Int)
                    text = "${teacher.middleName} ${teacher.firstName} ${teacher.lastName}"

                })
            })
        }
    }
}