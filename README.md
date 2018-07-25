# data_mapper
MapのDelegatePropertyのキーをアノテーションで任意に設定

MutableMapの演算子をオーバーロードを実装しているため必ずMutableMapperを継承してください
<pre><code>class Human(map:MutableMap<String,Any>): MutableMapper() {
  @Mapper(name = "first_name")
  val firstName: String by map
  @Mapper(name = "last_name")
  val lastName: String by map
  val age: Int by map
}
</code></pre>
