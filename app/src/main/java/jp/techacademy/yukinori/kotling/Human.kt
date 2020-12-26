package jp.techacademy.yukinori.kotling

import android.util.Log


open class Human: Animal, Thinkable {

    var hobby: String

    constructor(name: String, age:Int, hobby: String): super(name, age){
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + name + "です。歳は" + age + "です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える")
    }
}