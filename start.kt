data class Person(val name: string, val age: Int? = null)

fun main(args: Array<String>) {
    val person = listOf(Person("Alice"), Person("Bob", age = 29))

    val oldest = person.maxBy { it.age ?: 0 }
    println("The old is: $oldest")
}