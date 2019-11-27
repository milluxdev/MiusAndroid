package cn.mius.mius

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LauncherActivity : AppCompatActivity() {
    lateinit var handler: Handler
    lateinit var runnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        if (!isTaskRoot) {
            finish()
            return
        }
        handler = Handler()
        runnable = Runnable {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        handler.postDelayed(runnable, 1000)
        Toast.makeText(this@LauncherActivity, R.string.logo_text, Toast.LENGTH_SHORT).show()
    }
}
