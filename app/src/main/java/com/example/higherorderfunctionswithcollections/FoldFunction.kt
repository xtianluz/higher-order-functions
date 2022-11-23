package com.example.higherorderfunctionswithcollections

fun main(){
    val totalPrice = cookies.fold(0.0){
        total, cookies -> total + cookies.price
    }
    println("Total price: $totalPrice")
}