package com.wanjaniko.mywallet

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.core.view.WindowInsetsCompat.Type
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter (val transactionList: List<Transaction>):RecyclerView.Adapter<TransactionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.transactions_item_list, parent, false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.tvCash.text = transaction.cash
        holder.tvTitle.text = transaction.title
        holder.tvDate.text = transaction.date
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}

class TransactionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvCash = itemView.findViewById<TextView>(R.id.tvCash)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}