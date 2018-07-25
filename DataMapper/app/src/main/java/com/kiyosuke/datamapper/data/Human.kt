package com.kiyosuke.datamapper.data

import com.kiyosuke.datamapper.core.Mapper
import com.kiyosuke.datamapper.core.MutableMapper


class Human(map: MutableMap<String, Any>) : MutableMapper() {
    @Mapper("first_name")
    var firstName: String by map
    @Mapper("last_name")
    var lastName: String by map
    var age: Int by map
}
