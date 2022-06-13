package com.example.mvp_latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityMVP : AppCompatActivity(),MainView {
    private lateinit var etPanjang : EditText
    private lateinit var etlebar : EditText
    private lateinit var bthitungluas : Button
    private lateinit var bthitungkeliling : Button
    private lateinit var tvhasil : TextView
    private lateinit var mainPresenter: MainPresenter
    private lateinit var inputsisi : EditText
    private lateinit var btluaspersegi : Button
    private lateinit var btkelilingpersegi : Button
    private lateinit var hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)
        etPanjang = findViewById(R.id.etpanjang)
        etlebar = findViewById(R.id.etlebar)
        bthitungluas = findViewById(R.id.btluas)
        bthitungkeliling = findViewById(R.id.btkeliling)
        tvhasil = findViewById(R.id.tvhasil)
        inputsisi = findViewById(R.id.sisi)
        btluaspersegi = findViewById(R.id.luaspersegi)
        btkelilingpersegi = findViewById(R.id.kelilingpersegi)
        hasil = findViewById(R.id.hasil)


        bthitungluas.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etlebar.text.toString().toFloat()
            mainPresenter.hitungluaspersegipanjang(panjang, lebar)
        }
        bthitungkeliling.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etlebar.text.toString().toFloat()
            mainPresenter.hitungluaspersegipanjang(panjang, lebar)
        }

        btluaspersegi.setOnClickListener {
            val sisi = inputsisi.text.toString().toFloat()
            mainPresenter.hitungluaspersegi(sisi)
        }
        btkelilingpersegi.setOnClickListener {
            val sisi = inputsisi.text.toString().toFloat()
            mainPresenter.hitungkelilingpersegi(sisi)
        }
    }
    override fun updateluas(Luas: Float) {
        tvhasil.text=Luas.toString()
    }

    override fun updatekeliling(keliling: Float) {
        tvhasil.text=keliling.toString()
    }

    override fun showError(errorMsg: String) {
        tvhasil.text = errorMsg
    }

    override fun updateluaspersegi(Luas: Float) {
        hasil.text = Luas.toString()
    }

    override fun updatekelilingpersegi(keliling: Float) {
        hasil.text = keliling.toString()
    }
}