package com.example.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable{

    var hobby: String = ""

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age) {
        this.name = name
        this.age = age
    }

    constructor(hobby: String) : super() {
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。」")
    }

    // Movableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}