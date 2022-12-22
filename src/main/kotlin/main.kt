fun main(args: Array<String>) {

    structure_while()
    structure_while_2()
}

fun structure_while() {
    // using lambda code
    var aVector = Array(10, {i -> i * i})
    var index = 0

    while (index < 8) {
        println(aVector[index])
        index++
    }
}


fun structure_while_2() {
    // using lambda code
    var aVector = Array(10, {i -> i * i})
    var index = 0

    // size count dynamic
    while (index < aVector.size) {
        println(aVector[index])
        index++
    }
}