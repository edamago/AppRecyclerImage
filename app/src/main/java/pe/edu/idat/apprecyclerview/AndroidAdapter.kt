package pe.edu.idat.apprecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerview.databinding.ItemAndroidBinding

class AndroidAdapter(var listaAndroid: List<Android>,val context: Context):RecyclerView.Adapter<AndroidAdapter.ViewHolder>() {

    inner class  ViewHolder(val binding: ItemAndroidBinding):RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding= ItemAndroidBinding.inflate(LayoutInflater.from(parent.context))

        return ViewHolder(binding)
    }

    override fun getItemCount()=listaAndroid.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(listaAndroid[position]){
                binding.tvNombreAndroid.text=nombre
                binding.tvVersionAndroid.text=version
                binding.ivAndroid.setImageResource(imagen)
                binding.cvAndroid.setOnClickListener(View.OnClickListener {
                        Toast.makeText(context,"Version elegida: $nombre",Toast.LENGTH_LONG)
                })
            }
        }
    }
}