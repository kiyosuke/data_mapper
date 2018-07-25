package com.kiyosuke.datamapper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kiyosuke.datamapper.data.Human
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MapからHumanを作成
        val human = Human(mutableMapOf(
                "first_name" to "やまだ",
                "last_name" to "たかし",
                "age" to 30
        ))

        println("Human: firstName: ${human.firstName} lastName: ${human.lastName} age: ${human.age}")
    }
}
