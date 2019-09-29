package com.queserasera.xinagarira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mEditIcon = findViewById(R.id.edit_button) as ImageView
        mEditIcon.setOnClickListener(View.OnClickListener { v ->
            // edit으로 이동
            showEdit()
        })
    }

    fun showEdit() {
        val intent = Intent(baseContext, EditActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
        finish()
        overridePendingTransition(0, R.anim.fade_out)
    }
}
