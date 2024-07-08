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
        var salary2 = Expenses("","Electricty","KES 1,000","1 July 2024")
        var salary3 = Expenses("","Food","KES 10,000","1 July 2024")
        var salary4 = Expenses("","Rent","KES 15,000","1 July 2024")
        var salary5 = Expenses("","Dividends","KES 30,000","1 July 2024")
        var salary6 = Expenses("","Internet","KES 1,500","1 July 2024")
        var salary7 = Expenses("","Shopping","KES 20,000","1 July 2024")
        var salary8 = Expenses("","Bus Fare","KES 6,000","1 July 2024")
        var salary9 = Expenses("","Water Bill","KES 3,000","1 July 2024")

var myexpences = listOf(salary1,salary2,salary3,salary4,salary5,salary6,salary7,salary8,salary9)
        val expensesAdapter = ExpensesAdapter(myexpences)
        binding.rvExpense.adapter = expensesAdapter

    }    }