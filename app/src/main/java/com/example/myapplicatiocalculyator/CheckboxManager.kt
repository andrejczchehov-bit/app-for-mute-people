package com.example.myapplicatiocalculyator

import com.google.android.material.checkbox.MaterialCheckBox

class CheckboxManager(
    private val squareCheckBox: MaterialCheckBox
) {





    fun setup() {
        squareCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Галочка установлена
            } else {
                // Галочка снята
            }
        }
    }
}