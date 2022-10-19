package com.erif.preventdoubleclick

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.erif.singleclick.PreventDoubleClick

class MainActivity : AppCompatActivity() {

    private var number = 0
    private var txt: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.txt)
        val btnReset: Button = findViewById(R.id.btnReset)
        btnReset.setOnClickListener {
            number = 0
            log(0)
        }

        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            PreventDoubleClick {
                countNumber()
            }
        }

        val btn2: Button = findViewById(R.id.btn2)
        btn2.setOnClickListener {
            PreventDoubleClick {
                countNumber()
            }
        }

    }

    private fun countNumber() {
        number+=1
        log(number)
    }

    private fun log(count: Int) {
        txt?.text = "$count"
    }

}