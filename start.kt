data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val person = listOf(Person("Alice"), Person("Bob", age = 29))

    val oldest = 1
    println("The old is: $oldest")
}