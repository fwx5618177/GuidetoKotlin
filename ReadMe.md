[TOC]

# 本书内容
1. 使用场景
2. 基本语法
3. 函数
4. 类: 数据类和伴生对象
5. lambda
6. 数据类型系统
7. 泛型
8. 注解和反射

# 使用场景
- [在线测试](https://play.kotlinlang.org/)
- 常用于:
    - 服务端代码(常见web)
    - Android的移动应用
- 静态类型

```kotlin
data class Person(val name: string, val age: Int? = null)

fun main(args: Array<String>) {
    val person = listOf(Person("Alice"), Person("Bob", age = 29))

    val oldest = person.maxBy { it.age ?: 0 }
    println("The old is: $oldest")
}
```

## 函数式
- 简洁
- 多线程安全







