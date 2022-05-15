package com.example.bodmas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMult: Button
    lateinit var btnModulus: Button
    lateinit var tvAns: TextView
    lateinit var etNumberone: EditText
    lateinit var etNumbertwo: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMult = findViewById(R.id.btnMult)
        btnModulus = findViewById(R.id.btnModulus)
        etNumberone = findViewById(R.id.etNumberone)
        etNumbertwo = findViewById(R.id.etNumbertwo)
        tvAns = findViewById(R.id.tvAns)

        btnAdd.setOnClickListener {
    tvAns.text = ""
    val numberone = etNumberone.text.toString()
    val numbertwo = etNumbertwo.text.toString()
    if (numberone.isBlank()){
        etNumberone.setError("Number required")
        return@setOnClickListener
    }
    if (numbertwo.isBlank()){
        etNumbertwo.setError("Number required")
        return@setOnClickListener
    }
    addNums(numberone.toInt(), numbertwo.toInt())
    }

        btnSub.setOnClickListener {
            tvAns.text = ""
            val numberone = etNumberone.text.toString()
            val numbertwo = etNumbertwo.text.toString()
            if (numberone.isBlank()){
                etNumberone.setError("Number required")
                return@setOnClickListener
            }
            if (numbertwo.isBlank()){
                etNumbertwo.setError("Number required")
                return@setOnClickListener
            }
            subNums(numberone.toInt(), numbertwo.toInt())
        }
        btnMult.setOnClickListener {
            tvAns.text = ""
            val numberone = etNumberone.text.toString()
            val numbertwo = etNumbertwo.text.toString()
            if (numberone.isBlank()){
                etNumberone.setError("Number required")
                return@setOnClickListener
            }
            if (numbertwo.isBlank()){
                etNumbertwo.setError("Number required")
                return@setOnClickListener
            }
            multNums(numberone.toInt(), numbertwo.toInt())
        }

        btnModulus.setOnClickListener {
            tvAns.text = ""
            val numberone = etNumberone.text.toString()
            val numbertwo = etNumbertwo.text.toString()
            if (numberone.isBlank()){
                etNumberone.setError("Number required")
                return@setOnClickListener
            }
            if (numbertwo.isBlank()){
                etNumbertwo.setError("Number required")
                return@setOnClickListener
            }
            modNums(numberone.toInt(), numbertwo.toInt())
        }
    }
    fun addNums(x: Int,y: Int){
    var addition = x + y
    tvAns.text = addition.toString()

}
    fun subNums(m: Int,n: Int){
        var subtraction = m - n
        tvAns.text = subtraction.toString()
    }

    fun multNums(m: Int,n: Int){
        var multiplication = m * n
        tvAns.text = multiplication.toString()
    }
    fun modNums(m: Int,n: Int){
        var modulus = m % n
        tvAns.text = modulus.toString()
    }
}

