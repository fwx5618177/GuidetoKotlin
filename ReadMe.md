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

## 应用
服务端:
- return html
- http暴露JSON API的移动应用后端服务
- RPC的微服务

Android:
- API

# 工具
- 编译代码: 
    - 编译代码:`kotlinc <source file or directory> -inlcude-runtime -d <jar name>`
    - java执行: `java -jar <jar name>`

# 基本语法
- 表达式函数
```kotlin
fun max(a: Int, b: Int): Int = if (a > b) a else b
```
- 变量：
    - val: 不可变引用
    - var: 可变引用
- 字符串模板: `println("Hri $test")`
- 源码的布局:
```kotlin
package xx

import java.util.Random

class Test{
    val isS: Boolean
        get() = height == width 
}

fun text():Re {}

fun main(args: Array<String>) {}
```
- 枚举体: `enum class Color {}`
- `when`处理枚举体:
    - when允许使用任何对象
```kotlin
fun getMenu(color: Color) = when (color) {
    Color.Red -> "Richard"
    Color.White -> "test"
}
```
- while/for/do-while

# 函数
- 创建集合: `hashSetOf(1,2,3)`

# 继承
```kotlin
class test: Clickable, Focus {
    override fun showOff () {
        super<Clickable>.showOff()
        super<Focus>.showOff()
    }
}
```










