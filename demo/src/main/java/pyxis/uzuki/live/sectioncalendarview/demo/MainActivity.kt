package pyxis.uzuki.live.sectioncalendarview.demo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, KotlinActivity::class.java))
        }

        btnJava.setOnClickListener {
            startActivity(Intent(this@MainActivity, JavaActivity::class.java))
        }
    }
}
