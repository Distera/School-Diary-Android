package com.example.schooldiaryandroid

import android.content.Intent
import android.os.Bundle
import android.os.StrictMode
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.openapitools.client.apis.StudentsApi
import org.openapitools.client.models.StudentMinDto


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().permitAll().build())

        val apiInstance = StudentsApi("http://192.168.1.36:5000")

        val result = apiInstance.studentsGet()
        val intent = Intent(this, StudentActivity::class.java)

        val studentsTableLayout = findViewById<View>(R.id.myLayout) as TableLayout
        studentsTableLayout.addView(TableRow(this).also {
            it.addView(TextView(this).apply { text = " Ученик " })
            it.addView(TextView(this).apply { })
            it.addView(TextView(this).apply { })
        })

        result.forEach { student ->
            studentsTableLayout.addView(TableRow(this).also {
                it.addView(TextView(this).apply { text = "${student.middleName} ${student.firstName} ${student.lastName}"})
                it.addView(Button(this).apply {
                    text = "успеваемость"
                    textSize = 11.0f
                    setOnClickListener {
                        intent.putExtra("id", student.id)
                        startActivity(intent)
                    }
                })
                it.addView(Button(this).apply {
                    text = "оценить"
                    textSize = 11.0f
                    setOnClickListener {
                        intent.putExtra("id", student.id)
                        startActivity(intent)
                    }
                })
            })
        }
    }
}