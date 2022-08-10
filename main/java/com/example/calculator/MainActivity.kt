package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ac.setOnClickListener{
            input.text=""
            ans.text=""
        }
        zerozero.setOnClickListener{
            input.append("00")
        }
        zero.setOnClickListener{
            input.append("0")
        }
        dot.setOnClickListener{
            input.append(".")
        }
        one.setOnClickListener{
            input.append("1")
        }
        two.setOnClickListener{
            input.append("2")
        }
        three.setOnClickListener{
            input.append("3")
        }
        four.setOnClickListener{
            input.append("4")
        }
        five.setOnClickListener{
            input.append("5")
        }
        six.setOnClickListener{
            input.append("6")
        }
        seven.setOnClickListener{
            input.append("7")
        }
        eight.setOnClickListener{
            input.append("8")
        }
        nine.setOnClickListener{
            input.append("9")
        }
        startbrac.setOnClickListener{
            input.append("(")
        }
        enbrac.setOnClickListener{
            input.append(")")
        }
        plus.setOnClickListener{
            input.append("+")
        }
        minus.setOnClickListener{
            input.append("-")
        }
        multiply.setOnClickListener{
            input.append("*")
        }
        divide.setOnClickListener{
            input.append("/")
        }
        equal.setOnClickListener{

            val expression = ExpressionBuilder(input.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if(result == longresult.toDouble())
            {
                 ans.text =longresult.toString()
            }else{

                ans.text = result.toString()
            }

        }
    }
}