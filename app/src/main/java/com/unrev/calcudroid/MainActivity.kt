package com.unrev.calcudroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    lateinit var input: TextView
    lateinit var signBox: TextView
    var sign: String = ""
    var value1: String = ""
    var value2: String = ""

    var num1: Double = 0.0
    var num2: Double = 0.0
    var result: Double = 0.0

    var hasDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input = findViewById<TextView>(R.id.input)
        signBox = findViewById<TextView>(R.id.sign)
    }

    @SuppressLint("SetTextI18n")
    fun btnClick_0(view: View) {
        input.text = input.text.toString() + "0"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_1(view: View) {
        input.text = input.text.toString() + "1"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_2(view: View) {
        input.text = input.text.toString() + "2"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_3(view: View) {
        input.text = input.text.toString() + "2"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_4(view: View) {
        input.text = input.text.toString() + "4"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_5(view: View) {
        input.text = input.text.toString() + "5"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_6(view: View) {
        input.text = input.text.toString() + "6"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_7(view: View) {
        input.text = input.text.toString() + "7"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_8(view: View) {
        input.text = input.text.toString() + "8"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_9(view: View) {
        input.text = input.text.toString() + "9"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_dot(view: View) {
        if (!hasDot) {
            if (input.text.toString().equals("")) {
                input.text = "0."
            } else {
                input.text = input.text.toString() + "."
            }
            hasDot = true
        }
        input.text = input.text.toString() + "0"

    }

    @SuppressLint("SetTextI18n")
    fun btnClick_subtract(view: View) {
        sign = "-"
        value1 = input.text.toString()
        input.text = null
        signBox.text = "-"
        hasDot = false
    }

    @SuppressLint("SetTextI18n")
    fun btnClick_add(view: View) {
        sign = "+"
        value1 = input.text.toString()
        input.text = null
        signBox.text = "+"
        hasDot = false

    }


    fun btnClick_divide(view: View) {
        sign = "/"
        value1 = input.text.toString()
        input.text = null
        signBox.text = "÷"
        hasDot = false
    }

    fun btnClick_equal(view: View) {
        if (sign == null) {
            signBox.text = "Error!"
        } else if (input.text.equals("")) {
            signBox.text = "Error!"
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals(
                ""
            )
        ) {
            signBox.text = "Error!"
        } else {
            when (sign) {
                "log" -> {
                    value1 = input.text.toString()
                    num1 = value1.toDouble()
                    input.text = (log10(num1)).toString() + ""
                    sign = ""
                    signBox.text = null
                }
                "ln" -> {
                    value1 = input.text.toString()
                    num1 = value1.toDouble()
                    input.text = (ln(num1)).toString() + ""
                    sign = ""
                    signBox.text = null
                }
                "power" -> {
                    num1 = value1.toDouble()
                    value2 = input.text.toString()
                    num2 = value2.toDouble()
                    input.text = num1.pow(num2).toString()
                    sign = ""
                    signBox.text = null
                }
                "root" -> {
                    value1 = input.text.toString()
                    num1 = value1.toDouble()
                    input.text = sqrt(num1).toString()
                    sign = ""
                    signBox.text = null
                }
                "factorial" -> {
                    value1 = input.text.toString()
                    num1 = value1.toDouble()
                    var i: Int = value1.toInt() - 1
                    while (i > 0) {
                        num1 *= i
                        i--
                    }
                    input.text = num1.toString()
                    sign = ""
                    signBox.text = null
                }
                "sin" -> {
                    value1 = input.text.toString()
                    num1 = value1.toDouble()
                    input.text = sin(num1).toString()
                    sign = ""
                    signBox.text = null
                }
                "cos" -> {
                    value1 = input.text.toString()
                    num1 = value1.toDouble()
                    input.text = cos(num1).toString()
                    sign = ""
                    signBox.text = null
                }
                "tan" -> {
                    value1 = input.text.toString()
                    num1 = value1.toDouble()
                    input.text = tan(num1).toString()
                    sign = ""
                    signBox.text = null
                }
                "+" -> {
                    value2 = input.text.toString()
                    num1 = value1.toDouble()
                    num2 = value2.toDouble()
                    result = num1 + num2
                    input.text = result.toString()
                    sign = ""
                    signBox.text = null
                }
                "-" -> {
                    value2 = input.text.toString()
                    num1 = value1.toDouble()
                    num2 = value2.toDouble()
                    result = num1 - num2
                    input.text = result.toString()
                    sign = ""
                    signBox.text = null
                }
                "*" -> {
                    value2 = input.text.toString()
                    num1 = value1.toDouble()
                    num2 = value2.toDouble()
                    result = num1 * num2
                    input.text = result.toString()
                    sign = ""
                    signBox.text = null
                }
                "/" -> {
                    value2 = input.text.toString()
                    num1 = value1.toDouble()
                    num2 = value2.toDouble()
                    result = num1 / num2
                    input.text = result.toString()
                    sign = ""
                    signBox.text = null
                }
                else -> {
                    return
                }
            }
        }
    }

    fun btnClick_multiply(view: View) {
        sign = "*"
        value1 = input.text.toString()
        input.text = null
        signBox.text = "×"
        hasDot = false
    }

    fun btnClick_clear(view: View) {
        input.text = null
        signBox.text = null
        value1 = ""
        value2 = ""
        sign = ""
        hasDot = false
    }

    fun btnClick_delete(view: View) {
        if (input.text == "") {
            input.text = null
        } else {
            val len = input.text.length
            val s = input.text.toString()
            if (s[len - 1] == '.') {
                hasDot = false
                input.text = input.text.subSequence(0, input.text.length - 1)
            } else {
                input.text = input.text.subSequence(0, input.text.length - 1)
            }
        }
    }

    fun btnClick_tan(view: View) {
        sign = "tan"
        input.text = null
        signBox.text = "tan"
        hasDot = false
    }

    fun btnClick_cos(view: View) {
        sign = "cos"
        input.text = null
        signBox.text = "cos"
        hasDot = false
    }

    fun btnClick_sin(view: View) {
        sign = "sin"
        input.text = null
        signBox.text = "sin"
        hasDot = false
    }

    fun btnClick_factorial(view: View) {
        sign = "factorial"
        input.text = null
        signBox.text = "!"
        hasDot = false
    }

    fun btnClick_root(view: View) {
        sign = "root"
        input.text = null
        signBox.text = "√"
        hasDot = false
    }

    fun btnClick_power(view: View) {
        sign = "power"
        value1 = input.text.toString()
        input.text = null
        signBox.text = "xⁿ"
        hasDot = false
    }

    fun btnClick_ln(view: View) {
        sign = "ln"
        input.text = null
        signBox.text = "ln"
        hasDot = false
    }

    fun btnClick_log(view: View) {
        sign = "log"
        input.text = null
        signBox.text = "log"
        hasDot = false
    }
}