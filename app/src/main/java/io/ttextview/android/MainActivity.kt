package io.ttextview.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tuonbondol.textviewutil.bold
import com.tuonbondol.textviewutil.compareVisibility
import com.tuonbondol.textviewutil.strike
import com.tuonbondol.textviewutil.underline
import kotlinx.android.synthetic.main.activity_main.*

/***
 *
 * @author TUON BONDOL on 8/11/17.
 *
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvUnderline.underline()

        tvStrike.strike()

        tvBold.compareVisibility(10.0, 10.0)

    }
}