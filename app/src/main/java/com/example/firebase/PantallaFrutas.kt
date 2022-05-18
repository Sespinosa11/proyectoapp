package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class PantallaFrutas : AppCompatActivity() {

    lateinit var recycler: RecyclerView

    var listaProductos: List<ProductosFrutas> = listOf(
        ProductosFrutas(
            "https://exoticfruitbox.com/wp-content/uploads/2015/10/papaya-3-Exotic.jpg",
            "Kilo de papaya",
            "$1.000"
        ),
        ProductosFrutas(
            "https://images.ecestaticos.com/XzFf5fJnhRqdwsyLzg_OYeT3jaY=/0x85:1896x1505/1200x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F03c%2F61a%2Fca3%2F03c61aca3e0d45f3d52402f4ed27ab83.jpg",
            "Kilo de coco",
            "$7.000"
        ),
        ProductosFrutas(
            "https://www.elespectador.com/resizer/eILqvIqVsLg2e5Bfg34_hjFPXq0=/920x613/filters:format(jpeg)/cloudfront-us-east-1.images.arcpublishing.com/elespectador/B6GA35WBFVEZZEHQJ5JXLYAR6I.jpg",
            "Libra de fresa",
            "$1.650"
        ),
        ProductosFrutas(
            "https://i.ytimg.com/vi/wp8zw_TRG_I/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBfawIUkF4F-RNnHxUCdvi99VcZLg",
            "Libra de Mora",
            "$5.600"
        ),
        ProductosFrutas(
            "https://solofruver.com/wp-content/uploads/2020/06/mandarina-oneco.jpg",
            "Libra de mandarina",
            "$4.000"
        ),
        ProductosFrutas(
            "https://elpoderdelconsumidor.org/wp-content/uploads/2022/02/naranja-1.jpg",
            "Libra de naranja",
            "$3.000"
        ),
        ProductosFrutas(
            "https://www.catorce6.com/images/noticias/breves/manzanafranciaIMPO.jpg",
            "Libra de manzana",
            "$3.500"
        ),
        ProductosFrutas(
            "https://cloudfront-us-east-1.images.arcpublishing.com/semana/DD2CJ6HVZJGXDPLGYADE6GC3RY.jpeg",
            "Libra de uva",
            "$6.000"
        ),
        ProductosFrutas(
            "https://cnnespanol.cnn.com/wp-content/uploads/2021/12/Mango-Colombia-exportacio%CC%81n-EEUU-presidencia.jpeg?quality=100&strip=info",
            "Libra de mango",
            "$3.800"
        ),
        ProductosFrutas(
            "https://s.cornershopapp.com/product-images/2194309.jpg?versionId=LZ78U7fwaX7l9khHZxI12aASrTmPK3lm",
            "Libra pera",
            "$2.500"
        ),
        ProductosFrutas(
            "https://s.cornershopapp.com/product-images/3202436.jpg?versionId=WIweQ4EsmMGpGzdx.TBS8g1ZrIjE2ACJ",
            "Melon und:",
            "$5.200"
        )
    )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_pantalla_frutas)
        }
    fun intancias(){
        recycler = findViewById(R.id.Menu)
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter = RecyclearProductoFrutas(this,listaProductos)
    }
}