package com.example.expensetracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class ExpensesAdapter {var expensesList: List<Expenses>):
//    RecyclerView.Adapter<ExpensesViewHolder>() {
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
//            val itemView = LayoutInflater.from(parent.context)
//                .inflate(R.layout.myexpenses_list_item, parent, false)
//            return ExpensesViewHolder(itemView)
//        }
//
//        override fun onBindViewHolder(holder: ExpensesViewHoder, position: Int) {
////            val book = expensesList[position]
////            holder.tvMoneyIn.text = book.title
////            holder.tvAuthor.text = book.author
////            holder.tvDate.text = book.date
////            holder.tvPreview.text = book.preview
//
//        }
//
//        override fun getItemCount(): Int {
//            return expensesList.size
//        }
//    }
//
//    class ExpensesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//        var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
//        var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
//        var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
//        var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
//    }
//
//}