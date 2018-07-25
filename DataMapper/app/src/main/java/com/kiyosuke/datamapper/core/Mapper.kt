package com.kiyosuke.datamapper.core

/**
 * マッピング用アノテーション
 * 定義したEntityクラスの変数名とMapのキー名が違う場合に
 * 変数名の代わりにこのアノテーションでセットした文字をキーとしてマップから取り出す
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Mapper(val name:String)