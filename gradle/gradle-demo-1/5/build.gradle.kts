tasks.register("hello") {
    doFirst {
        println("hello from doFirst\n")
    }
}

tasks.register("world") {

    dependsOn("hello")

    doLast {
        println("world from doLast\n")
    }
}