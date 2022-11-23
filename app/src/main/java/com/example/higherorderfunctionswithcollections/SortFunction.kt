package com.example.higherorderfunctionswithcollections

fun main(){
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Sorted alphabetically")
    alphabeticalMenu.forEach(){
        println(it.name)
    }
}