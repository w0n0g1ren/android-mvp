package com.example.mvp_latihan

class MainPresenter(private val mainview : MainView) {
    fun hitungluaspersegipanjang(panjang:Float,lebar : Float){
        if(panjang == 0F){
            mainview.showError("panjang tidak boleh 0")
            return
        }
        if(lebar == 0F){
            mainview.showError("lebar tidak boleh 0")
            return
        }
        val luas = panjang*lebar
        mainview.updateluas(luas)
    }
    fun hitungkelilingpersegipanjang(panjang:Float,lebar : Float) {
        if (panjang == 0F) {
            mainview.showError("panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainview.showError("lebar tidak boleh 0")
            return
        }
        val keliling = 2 * (panjang + lebar)
        mainview.updateluas(keliling)
    }
    fun hitungluaspersegi(sisi:Float){
        if (sisi == 0F) {
            mainview.showError("sisi tidak boleh 0")
            return
        }
        val luas = sisi*sisi
        mainview.updateluaspersegi(luas)
    }

    fun hitungkelilingpersegi(sisi:Float){
        if (sisi == 0F) {
            mainview.showError("sisi tidak boleh 0")
            return
        }
        val keliling = 4*sisi
        mainview.updatekelilingpersegi(keliling)
    }
}