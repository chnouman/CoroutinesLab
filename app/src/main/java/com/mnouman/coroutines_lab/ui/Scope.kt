package com.mnouman.coroutines_lab.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mnouman.coroutines_lab.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Scope : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope)


        print("before run blocking")
        runBlocking {
            launch {
                println("hello from blocking")
            }
            GlobalScope.launch {
                println("hello from global")
            }
            coroutineScope {
                println("hello from coroutine scope")
            }
        }
        println("after runBlocking")
    }
}
