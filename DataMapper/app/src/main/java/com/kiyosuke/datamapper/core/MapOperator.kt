package com.kiyosuke.datamapper.core

import kotlin.reflect.KProperty

/**
 * MutableMapのgetValueとsetValueの演算子をオーバーロード
 */
interface MapOperator {

    operator fun <V, V1 : V> MutableMap<String, V>.getValue(thisRef: Any?, property: KProperty<*>): V1

    operator fun <V> MutableMap<String, V>.setValue(thisRef: Any?, property: KProperty<*>, value: V)
}