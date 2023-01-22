import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.test.mid_exam.R

class MyAdapter(val flag:List<Int>, val country:List<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(private val row: View) : RecyclerView.ViewHolder(row) {
        val imageView: ImageView = row.findViewById(R.id.imageView3)
        val textView: TextView = row.findViewById(R.id.country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = country[position]

        // sets image to the imageview from itemHolder class
        holder.imageView.setImageResource(flag[position])

        // sets text to the textview from itemHolder class
        holder.textView.text = country[position]
    }

    override fun getItemCount(): Int {
        return country.size
    }
}