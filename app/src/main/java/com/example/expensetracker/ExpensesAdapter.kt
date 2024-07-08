package com.example.expensetracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpensesAdapter (var expensesList: List<Expenses>): RecyclerView.Adapter<ExpensesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.mysalary,parent,false)
        return ExpensesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val expense = expensesList[position]
        holder.tvSalary.text = expense.name
        holder.tvMoney.text = expense.amount
        holder.tvDate.text = expense.date

    }

    override fun getItemCount(): Int {
        return expensesList.size
    }
}



    class ExpensesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
        var tvMoney = itemView.findViewById<TextView>(R.id.tvMoney)
        var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    }


