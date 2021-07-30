package abc.com.recyclerviewuserinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class TaskActivity : AppCompatActivity() {
    lateinit var editTaskName : EditText
    lateinit var btnSave: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)
        editTaskName= findViewById(R.id.editTaskName)
        btnSave= findViewById(R.id.btnSave)
    }
}