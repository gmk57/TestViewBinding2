package gmk57.testviewbinding2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, SecondFragment())
                .addToBackStack(null).commit()
            supportFragmentManager.popBackStack()
        }
    }
}
