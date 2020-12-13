package jp.techacademy.yukinori.kotling

import android.util.Log

class BigDog: Dog {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, hobby: String, age: Int): super(name, hobby, age){
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "大きな犬です")
    }
}