package com.queserasera.xinagarira

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class ResultActivity : AppCompatActivity() {
    internal var handler = Handler()

    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var messages = listOf(
            "늘 행복하길 바라요",
            "이 또한 지나가리라",
            "좋은 일이 생길 거예요",
            "괜찮을 거예요",
            "다 잊어버려요"
        )

        var mMessageView = findViewById(R.id.message_view) as TextView
        var random = Random()
        var mMessage = messages[random.nextInt(messages.size)]
        mMessageView.text = mMessage

        handler.postDelayed({
            showMain()
        }, 2000)
    }

    fun showMain() {
        val intent = Intent(baseContext, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
        finish()
        overridePendingTransition(0, R.anim.fade_out)
    }
}
