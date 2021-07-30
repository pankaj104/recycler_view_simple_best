package abc.com.recyclerviewuserinput

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
   lateinit var recyclerMain : RecyclerView
  lateinit var layoutmanger: RecyclerView.LayoutManager

    // lets declare array list
    val bookList= arrayListOf(
        "Main ", "second", "third", "fourth", "fifth", "sixth"
    )
    // declare variable for the adapter
    lateinit var recyclerAdapter: Adapter  // here Adapter is name of Adapter class

    override fun onCreate(savedInstanceState: Bundle?) {

      //  val view= layoutInflater.inflate(R.layout.single_row, container, false )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerAdapter = Adapter(this, bookList)  //  recycle Adapter
        recyclerMain= findViewById(R.id.recyclerMain)   // Recycler view
      layoutmanger= LinearLayoutManager(this)  // layout manager


        //Now set layoutmanager and recycler Adapter with Recycler view
        recyclerMain.adapter= recyclerAdapter
        recyclerMain.layoutManager= layoutmanger


    }
    fun openNewTask(view: View) {
        startActivity(Intent(this,TaskActivity:: class.java))
    }
}