package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class pantallaCarnes : AppCompatActivity() {

    lateinit var recycler:RecyclerView

    var listaProductos: List<productosCarnes> = listOf(
        productosCarnes("https://static.diariovasco.com/www/multimedia/201906/03/media/cortadas/carne-roja-kS1C-R5uqUSGFlSqj84mn1I9bQuN-624x385@Diario%20Vasco.jpg","Libra de carne","$10.000"),
        productosCarnes("https://www.saborusa.com/sv/wp-content/uploads/sites/4/2021/02/Conoce-el-termino-ideal-de-la-carne-segun-su-tamanio_1.png","Kilo de carne","$19.000"),
        productosCarnes("https://neust.com.co/wp-content/uploads/2021/04/carne-molida.jpg","Carne Molida","$6.000"),
        productosCarnes("https://storage.contextoganadero.com/s3fs-public/blog/field_image/2019-01/04-02_carne-cerdo.png","Libra de Cerdo","$8.500"),
        productosCarnes("https://www.innaturale.com/es/wp-content/uploads/2021/07/Carne-de-cerdo.jpg","Kilo de Cerdo","$15.000"),
        productosCarnes("https://www.cocinayvino.com/wp-content/uploads/2020/06/Pollo2-e1591732730596.jpg","Pollo Completo","$9.500"),
        productosCarnes("https://imagenes.20minutos.es/files/image_656_370/uploads/imagenes/2017/11/05/574279.jpg","Pechuga und","$14.000"),
        productosCarnes("https://mercaldas.vtexassets.com/arquivos/ids/220339-800-auto?v=637625710333100000&width=800&height=auto&aspect=true","Pernil und :","$4.500"),
        productosCarnes("https://www.cafesonarte.com/wp-content/uploads/2020/04/mojarreins.png","Mojarra und:","$16.000"),
        productosCarnes("https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2018/12/propiedades-del-salmon-para-adelgazar.jpg","Salmon kilo:","55.000"),
        productosCarnes("https://www.animalgourmet.com/wp-content/uploads/2017/10/trucha-asalmonada-cultivo.jpg","Filete de Trucha","$22.000")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_carnes)
        intancias()


    }
    fun intancias(){
        recycler = findViewById(R.id.Menu)
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter = RecyclearProducto(this,listaProductos)
    }
}

