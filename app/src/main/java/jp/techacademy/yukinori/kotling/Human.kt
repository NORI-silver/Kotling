package jp.techacademy.yukinori.kotling

import android.util.Log

open class Human: Animal, Thinkable {
    constructor(name: String, hobby: String, age:Int): super(name, hobby, age){
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + name + "です。歳は" + age + "です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える")
    }
}