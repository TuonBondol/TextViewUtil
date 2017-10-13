package com.tuonbondol.textviewutil

import android.graphics.Paint
import android.graphics.Typeface
import android.opengl.Visibility
import android.text.SpannableString
import android.text.style.StyleSpan
import android.view.View
import android.widget.TextView

/***
 *
 * @author TUON BONDOL on 8/11/17.
 *
 */

fun TextView.underline() {
    this.paintFlags = this.paintFlags or Paint.UNDERLINE_TEXT_FLAG
}

fun TextView.strike() {
    this.paintFlags = this.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
}

fun TextView.bold(text: CharSequence) {
    val mSpannableString = SpannableString(text)
    mSpannableString.setSpan(StyleSpan(Typeface.BOLD), 0, text.length, 0)

    this.text = mSpannableString
}

fun TextView.compareVisibility(oldValue: Double, currentValue: Double, currencyType: String = "$") {
    if (oldValue == 0.0) {
        this.visibility = View.GONE
        return
    }
    when (oldValue.compareTo(currentValue)) {
        0, -1 -> this.visibility = View.GONE
        1 -> {
            this.visibility = View.VISIBLE
            this.text = oldValue.toString().plus(currencyType)
        }
    }
}

fun TextView.compareVisibility(currencyType: String = "$", oldValue: Double, currentValue: Double) {
    if (oldValue == 0.0) {
        this.visibility = View.GONE
        return
    }
    when (oldValue.compareTo(currentValue)) {
        0, -1 -> this.visibility = View.GONE
        1 -> {
            this.visibility = View.VISIBLE
            this.text = currencyType.plus(oldValue.toString())
        }
    }
}