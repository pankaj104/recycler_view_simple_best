package abc.com.recyclerviewuserinput

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text


// Now we will create Adapter adding RecyclerVie.Adapter class  then attach adapter with
// View Holder (means provide view Holder to Recycler View)
// Then you will see error on Adapter class so just implement all with Alt + enter : Error will be Gone

// 3. Now we create  primary constructor which is Context and data (ArrayList datatype String)

class Adapter(val context: Context, val itemList : ArrayList<String>): RecyclerView.Adapter<Adapter.SampleViewHolder>() {

    // create view holder class  and recycler view
    // and viewholder hold view(means single row xml view )
class SampleViewHolder (view: View): RecyclerView.ViewHolder(view)
    {
    val textView: TextView= view.findViewById(R.id.txtRecyclerRowItem)
}

//  1.  create class of onCreateViewHolder
    // 2. these three method implemented of Adapter


    // this will create view with the help of layout inflater
    // Then we will inflate layout of list item means (single row)  and return view
    //2.  two parameter one (parent.context) for view holder and
    // another (R.layout.single_row, parent,false) for position




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
           val view=LayoutInflater.from(parent.context).inflate(R.layout.single_row, parent,false)

        // return the view holder class and pass the view
        // means view holder k reference ab yaha aa gaye
        // ab ye data onBindViewHolder me jayega SampleViewHolder ki return ki wajah se
        return SampleViewHolder(view)


    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        // store a value present in index 0 of the array list
        // each array item is String

        val text= itemList[position]
        //for hold the text view and each item new text view
        holder.textView.text= text

    }

    override fun getItemCount(): Int {
       return itemList.size
    }

}