package pe.edu.idat.apprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.apprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvAndroid.layoutManager=LinearLayoutManager(applicationContext)
        //LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,false)

        val adapter=AndroidAdapter(listaAndroid(),applicationContext)
        binding.rvAndroid.adapter=adapter
    }

    fun listaAndroid(): List<Android>{
        var lista = ArrayList<Android>()

        lista.add(Android("1","1.0",R.drawable.image1))
        lista.add(Android("2","1.0",R.drawable.image2))
        lista.add(Android("3","1.0",R.drawable.image3))
        lista.add(Android("4","1.0",R.drawable.image4))
        lista.add(Android("5","1.0",R.drawable.image5))
        lista.add(Android("6","1.0",R.drawable.image6))
        lista.add(Android("7","1.0",R.drawable.image7))
        lista.add(Android("8","1.0",R.drawable.image8))
        lista.add(Android("9","1.0",R.drawable.image9))
        lista.add(Android("10","1.0",R.drawable.image10))

        return lista

    }
}