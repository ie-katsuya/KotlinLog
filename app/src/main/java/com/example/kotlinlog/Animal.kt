package com.example.kotlinlog

abstract class Animal {
    // プロパティ
    var name: String = ""
    var age: Int = 0

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor()

    abstract fun say()
}