package com.example.expensetracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expensetracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvExpense.layoutManager = LinearLayoutManager(this)
        displayExpenses()

    }

    fun displayExpenses(){
        var salary1 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary2 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary3 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary4 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary5 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary6 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary7 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary8 = Expenses("","Salary","KES 40,000","1 July 2024")
        var salary9 = Expenses("","Salary","KES 40,000","1 July 2024")

var myexpences = listOf(salary1,salary2,salary3,salary4,salary5,salary6,salary7,salary8,salary9)
        val expensesAdapter = ExpensesAdapter(myexpences)
        binding.rvExpense.adapter = expensesAdapter

    }    }