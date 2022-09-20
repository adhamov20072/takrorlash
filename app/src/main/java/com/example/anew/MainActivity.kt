package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController=findNavController(R.id.controller)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.menu_settings->{startActivity(Intent(this,SettingsActivity::class.java))}
            R.id.menu_info->{
                val infoD=AlertDialog.Builder(this)
                infoD.setTitle("bu info")
                infoD.setMessage("Salom bolalar ayxshimisizlar")
                infoD.setPositiveButton("Close"){dialog,_->dialog.dismiss() }
                infoD.show()
            }
            R.id.menu_exit->{
                val infoD=AlertDialog.Builder(this)
                infoD.setTitle("Exit")
                infoD.setMessage("Ilovadan rostdan ham chiqmoqchimisiz")
                infoD.setNegativeButton("Yo'q"){dialog,_->dialog.dismiss() }
                infoD.setPositiveButton("Ha"){dialog,_->finish() }
                infoD.show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}