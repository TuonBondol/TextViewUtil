package com.tuonbondol.textviewutil

import android.graphics.Paint
import android.graphics.Typeface
import android.text.SpannableString
import android.text.style.StyleSpan
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