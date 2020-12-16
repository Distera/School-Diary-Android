package com.example.schooldiaryandroid

import android.R.attr.button
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
        init(result);

    }

    fun init(students: Array<StudentMinDto>) {
        val stk = findViewById<View>(R.id.myLayout) as TableLayout
        val tbrow0 = TableRow(this)
        val tv0 = TextView(this)
        tv0.text = " id "
        tbrow0.addView(tv0)
        val tv1 = TextView(this)
        tv1.text = " Фамилия "
        tbrow0.addView(tv1)
        val tv2 = TextView(this)
        tv2.text = " Имя "
        tbrow0.addView(tv2)
        val tv3 = TextView(this)
        tv3.text = " Отчество "
        tbrow0.addView(tv3)
        val tv4 = TextView(this)
        tbrow0.addView(tv4)

        students.forEach { student ->
            val tbrow = TableRow(this)
            val t1v = TextView(this)
            t1v.setLayoutParams(TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f))
            t1v.text = student.id.toString()
            t1v.gravity = Gravity.CENTER
            tbrow.addView(t1v)

            val t2v = TextView(this)
            t2v.text = student.lastName
            t2v.gravity = Gravity.CENTER
            tbrow.addView(t2v)

            val t3v = TextView(this)
            t3v.text = student.firstName
            t3v.gravity = Gravity.CENTER
            tbrow.addView(t3v)

            val t4v = TextView(this)
            t4v.text = student.middleName
            t4v.gravity = Gravity.CENTER
            tbrow.addView(t4v)

            val t5v = Button(this)
            t5v.text = "просмотр"
            t5v.setOnClickListener(View.OnClickListener { t4v.text = "FFFFFFjFFF"})
            tbrow.addView(t5v)

            stk.addView(tbrow)
        }
    }

}