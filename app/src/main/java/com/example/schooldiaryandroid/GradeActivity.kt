package com.example.schooldiaryandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.openapitools.client.apis.GradesApi
import org.openapitools.client.apis.StudentsApi
import org.openapitools.client.apis.SubjectsApi
import org.openapitools.client.apis.TeachersApi
import org.openapitools.client.models.GradeDto
import org.openapitools.client.models.StudentDto
import org.openapitools.client.models.SubjectMinDto
import org.openapitools.client.models.TeacherMinDto


class GradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade)

        val arguments = intent.extras
        val intentMain = Intent(this, MainActivity::class.java)
        val studentId = arguments!!["id"] as Int

        val apiInstanceGrades = GradesApi(MainActivity.basePath)
        val apiInstanceStudents = StudentsApi(MainActivity.basePath)
        val apiInstanceSubjects = SubjectsApi(MainActivity.basePath)
        val apiInstanceTeachers = TeachersApi(MainActivity.basePath)

        val student: StudentDto = apiInstanceStudents.studentsIdGet(studentId)
        val subjects: Array<SubjectMinDto> = apiInstanceSubjects.subjectsGet()
        val teachers: Array<TeacherMinDto> = apiInstanceTeachers.teachersGet()

        val title = findViewById<View>(R.id.textView3) as TextView
        val subjectSpinner = findViewById<View>(R.id.spinner) as Spinner
        val teacherSpinner = findViewById<View>(R.id.spinner2) as Spinner
        val based = findViewById<View>(R.id.editTextNumber) as EditText

        title.text = "Добавить оценку для ${student.firstName} ${student.middleName}"

        val adapterTeacher: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            R.layout.support_simple_spinner_dropdown_item,
            teachers.map { "${it.middleName} ${it.firstName} ${it.lastName}" }
        )
        adapterTeacher.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        teacherSpinner.adapter = adapterTeacher

        val adapterSubjects: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            R.layout.support_simple_spinner_dropdown_item,
            subjects.map { it.name as String }
        )
        adapterSubjects.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        subjectSpinner.adapter = adapterSubjects

        val saveData = findViewById<View>(R.id.save) as Button
        saveData.setOnClickListener {
            //******

            val selectedTeacher = teachers[teacherSpinner.selectedItemPosition].id
            val selectedSubject = subjects[subjectSpinner.selectedItemPosition].id


            val rez= GradeDto(based.text.toString().toInt(),studentId ,selectedTeacher,selectedSubject)
            apiInstanceGrades.gradesPost(rez)
            startActivity(intentMain)
        }

    }
}