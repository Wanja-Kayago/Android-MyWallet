package com.wanjaniko.mywallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.wanjaniko.mywallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTransaction.layoutManager= LinearLayoutManager(this)
displayTransactions()
    }

    fun displayTransactions(){
        val transaction1 = Transaction("Salary","KES 40000","1 July 2024","")
        val transaction2 = Transaction("Rent","KES 16000","2 July 2024","")
        val transaction3 = Transaction("Dividends","KES 2400","3 July 2024","")
        val transaction4 = Transaction("Electricity","KES 800","4 July 2024","")
        val transaction5= Transaction("Internet","KES 25000","5 July 2024","")
        val transaction6 = Transaction("Shopping","KES 35000","6 July 2024","")
        val transaction7 = Transaction("Bus Fare","KES 500","7 July 2024","")
        val transaction8 = Transaction("Water Bill","KES 16000","8 July 2024","")
         val transactionList = listOf(transaction1,transaction2,transaction3,transaction4,transaction5,transaction6,transaction7,transaction8)
        val transactionAdapter = TransactionAdapter(transactionList)
        binding.rvTransaction.adapter = transactionAdapter
    }    }
