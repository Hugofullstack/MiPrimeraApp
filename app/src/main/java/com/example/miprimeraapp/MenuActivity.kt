package com.example.miprimeraapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimeraapp.firstapp.FirstAppActivity
import com.example.miprimeraapp.imccalculator.ImcCalculatorActivity
import com.example.miprimeraapp.settings.SettingsActivity
import com.example.miprimeraapp.superheroapp.SuperHeroListActivity
import com.example.miprimeraapp.todoapp.TodoActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperHero.setOnClickListener { navigateToSuperHeroApp() }
        btnSettings.setOnClickListener { navigateToSettings() }
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {

        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp(){

        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

}

