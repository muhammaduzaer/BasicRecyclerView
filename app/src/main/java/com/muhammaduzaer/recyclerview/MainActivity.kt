package com.muhammaduzaer.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammaduzaer.recyclerview.adapter.MyAdapter
import com.muhammaduzaer.recyclerview.models.Song
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("Smells Like Teen Spirit", "Nirvana"))
        songsObjects.add(Song("Imagine", "John Lennon"))
        songsObjects.add(Song("Billie Jean", "Michael Jackson"))
        songsObjects.add(Song("Bohemian Rhapsody", "Queen"))
        songsObjects.add(Song("Like A Rolling Stone", "Bob Dylan"))
        songsObjects.add(Song("I Can't Get No Satisfaction", "Rolling Stones"))
        songsObjects.add(Song("Sweet Child O'Mine", "Guns N' Roses"))
        songsObjects.add(Song("Your Song", "Elton John"))
        songsObjects.add(Song("Heartbreak Hotel ", "Elvis Presley"))
        songsObjects.add(Song("Yesterday", "The Beatles"))
        songsObjects.add(Song("A Day In The Life", "The Beatles"))
        songsObjects.add(Song("Papa's Got A Brand New Bag", "James Brown"))
        songsObjects.add(Song("God Only Knows", "The Beach Boys"))
        songsObjects.add(Song("You've Lost That Lovin' Feeling", "The Righteous Brothers"))
        songsObjects.add(Song("Dancing In The Street", "Martha Reeves and the Vandellas"))
        songsObjects.add(Song("A Change Is Gonna Come", "Sam Cooke"))
        songsObjects.add(Song("River Deep Mountain High", "Ike and Tina Turner"))
        songsObjects.add(Song("Best Of My Love", "The Emotions"))
        recylcerViewSongsList.adapter = MyAdapter(songsObjects)
        recylcerViewSongsList.layoutManager = LinearLayoutManager(this)
    }
}