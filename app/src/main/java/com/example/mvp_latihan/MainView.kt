package com.example.mvp_latihan

interface MainView {
    fun updateluas(Luas : Float)
    fun updatekeliling (keliling : Float)
    fun showError (errorMsg : String)
    fun updateluaspersegi (Luas: Float)
    fun updatekelilingpersegi(keliling: Float)
}