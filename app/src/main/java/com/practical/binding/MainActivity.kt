package com.practical.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.practical.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("20WMR05671", "Yap Jun Jia")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.studentData = student

        binding.btnUpdate.setOnClickListener() {
            student.name = "Leong Zhi Shuang"

            binding.apply {
                invalidateAll()
            }
        }
    }
}