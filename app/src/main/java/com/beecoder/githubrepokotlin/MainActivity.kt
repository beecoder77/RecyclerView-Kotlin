package com.beecoder.githubrepokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HeroListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listHeroes = listOf(
            Hero(name = "Spider-Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/9/30/538cd33e15ab7/standard_xlarge.jpg"),
            Hero(name = "Black Panther", image = "https://i.annihil.us/u/prod/marvel/i/mg/1/c0/537ba2bfd6bab/standard_xlarge.jpg"),
            Hero(name = "Iron Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/6/a0/55b6a25e654e6/standard_xlarge.jpg"),
            Hero(name = "Dead Pool", image = "https://i.annihil.us/u/prod/marvel/i/mg/5/c0/537ba730e05e0/standard_xlarge.jpg"),
            Hero(name = "Captain Marvel", image = "https://i.annihil.us/u/prod/marvel/i/mg/c/10/537ba5ff07aa4/standard_xlarge.jpg"),
            Hero(name = "Ant Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/6/90/54ad7297b0a59/standard_xlarge.jpg"),
            Hero(name = "Spider-Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/9/30/538cd33e15ab7/standard_xlarge.jpg"),
            Hero(name = "Black Panther", image = "https://i.annihil.us/u/prod/marvel/i/mg/1/c0/537ba2bfd6bab/standard_xlarge.jpg"),
            Hero(name = "Iron Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/6/a0/55b6a25e654e6/standard_xlarge.jpg"),
            Hero(name = "Dead Pool", image = "https://i.annihil.us/u/prod/marvel/i/mg/5/c0/537ba730e05e0/standard_xlarge.jpg"),
            Hero(name = "Captain Marvel", image = "https://i.annihil.us/u/prod/marvel/i/mg/c/10/537ba5ff07aa4/standard_xlarge.jpg"),
            Hero(name = "Ant Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/6/90/54ad7297b0a59/standard_xlarge.jpg")
        )

        val heroesAdapter = HeroAdapter(listHeroes, this)

        rvMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = heroesAdapter
        }
    }

    override fun onHeroClick(hero: Hero){
        Toast.makeText(this,"Ini adalah ${hero.name}",Toast.LENGTH_SHORT).show()
    }
}
