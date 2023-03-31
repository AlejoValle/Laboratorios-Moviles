package com.ramirez.monedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var quarerCoin: ImageView
    private lateinit var dollarCoin: ImageView
    private lateinit var cashTextView: TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addEventListener()
    }

    fun bind(){
        fiveCents = findViewById(R.id.five_cents_image)
        tenCents = findViewById(R.id.ten_image)
        quarerCoin = findViewById(R.id.quarer_image)
        dollarCoin = findViewById(R.id.dollar_image)
        cashTextView = findViewById(R.id.total_text)
    }

    fun addEventListener(){
        fiveCents.setOnClickListener(){
            cash += 0.05
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        tenCents.setOnClickListener(){
            cash += 0.10
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        quarerCoin.setOnClickListener(){
            cash += 0.25
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }
        dollarCoin.setOnClickListener(){
            cash += 1.00
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }
    }
}