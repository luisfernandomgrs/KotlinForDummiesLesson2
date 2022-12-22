fun main(args: Array<String>) {

    structure_while()
    structure_while_2()
    structure_for()
}

fun structure_while() {
    // using lambda code
    var aVector = Array(10, {i -> i * i})
    var index = 0

    println("Structure While, stactic")
    while (index < 8) {
        println(aVector[index])
        index++
    }
}


fun structure_while_2() {
    // using lambda code
    var aVector = Array(10, {i -> i * i})
    var index = 0

    println("Structure While, dynamic")
    // size count dynamic
    while (index < aVector.size) {
        println(aVector[index])
        index++
    }
}

fun structure_for() {
    // using lambda code
    var aVector = Array(10, {i -> i * i})

    println("Structure, For")
    for (index in 0..9) {
        println(aVector[index])
    }
}