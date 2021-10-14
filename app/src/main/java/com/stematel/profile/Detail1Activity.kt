package com.stematel.profile

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.*

class Detail1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail1)

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val editText : EditText = findViewById(R.id.editTextTextPersonName)
        val buttoncheck : Button = findViewById(R.id.button)
        val namasaya1 = "Galih"
        val namasaya2 = "Asep"
        val namasaya3 = "Eki"
        val namasaya4 = "Cahyo"
        val detail : TextView = findViewById(R.id.textView2)
        val gambar = findViewById<ImageView>(R.id.imageView2)

        buttoncheck.setOnClickListener {
            if (editText.length()==0){
                Toast.makeText(this,"Masukkan nama", Toast.LENGTH_SHORT).show()
            }
            else{
                val input = editText.getText().toString()
                if (input == namasaya1){
                    val detailsaya = "Galih Trisna, 15, sokaraja"
                    detail.setText(detailsaya)
                    val gambarsaya = R.drawable.profil
                    gambar.setImageResource(gambarsaya)

                }
                else if (input == namasaya2){
                    val detailsaya = "Rafif Dian Axelingga, 27, purwokerto"
                    detail.setText(detailsaya)
                    val gambarsaya = R.drawable.pf1
                    gambar.setImageResource(gambarsaya)

                }
                else if (input == namasaya3){
                    val detailsaya = "Ekiano Agryan Fathin, 09, Cilongok"
                    detail.setText(detailsaya)
                    val gambarsaya = R.drawable.pf2
                    gambar.setImageResource(gambarsaya)

                }
                else if  (input == namasaya4){
                    val detailsaya = "Cahyo Susilo, 06, Wangon"
                    detail.setText(detailsaya)
                    val gambarsaya = R.drawable.pf3
                    gambar.setImageResource(gambarsaya)

                }
                else{
                    Toast.makeText(this,"Nama salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}