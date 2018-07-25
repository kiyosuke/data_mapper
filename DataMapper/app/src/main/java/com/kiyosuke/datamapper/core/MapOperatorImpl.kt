package com.kiyosuke.datamapper.core

import kotlin.reflect.KProperty

/**
 * [MapOperator]の演算子を実装
 */
class MapOperatorImpl : MapOperator {
    override fun <V, V1 : V> MutableMap<String, V>.getValue(thisRef: Any?, property: KProperty<*>): V1 {
        val annotation = property.annotations.firstOrNull { it is Mapper }
        if (annotation != null && annotation is Mapper) {
            @Suppress("UNCHECKED_CAST") return this[annotation.name] as V1
        } else {
            @Suppress("UNCHECKED_CAST") return this[property.name] as V1
        }
    }

    override fun <V> MutableMap<String, V>.setValue(thisRef: Any?, property: KProperty<*>, value: V) {
        val annotation = property.annotations.firstOrNull() { it is Mapper }
        if (annotation != null && annotation is Mapper) {
            this[annotation.name] = value
        } else {
            this[property.name] = value
        }
    }
}