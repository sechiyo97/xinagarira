package com.queserasera.xinagarira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        var mSendIcon = findViewById(R.id.send_button) as Button
        mSendIcon.setOnClickListener(View.OnClickListener { v ->
            // edit으로 이동
            showLoading()
        })
    }

    fun showLoading() {
        val intent = Intent(baseContext, LoadingActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
        finish()
        overridePendingTransition(0, R.anim.fade_out)
    }
}
