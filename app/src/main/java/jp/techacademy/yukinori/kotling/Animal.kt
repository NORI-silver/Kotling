package jp.techacademy.yukinori.kotling

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, hobby: String, age: Int){
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    abstract fun say()
}