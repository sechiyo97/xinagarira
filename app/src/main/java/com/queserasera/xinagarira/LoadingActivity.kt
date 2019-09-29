package com.queserasera.xinagarira

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity : AppCompatActivity() {
    internal var handler = Handler()

    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        handler.postDelayed({
            showResult()
        }, 2000)
    }

    fun showResult() {
        val intent = Intent(baseContext, ResultActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
        finish()
        overridePendingTransition(0, R.anim.fade_out)
    }
}
