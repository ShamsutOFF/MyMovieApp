package com.example.mymovieapp

class Example {
}

class Calculator{

    fun plus (first: Int, second: Int): Int {
        return first + second
    }

    fun div(first: Double, second: Double): Double {
        return if (second!=0.0){
            first.div(second)
        }else if (first>0){
            Double.POSITIVE_INFINITY
        }else{
            Double.NEGATIVE_INFINITY
        }
    }
    fun bar(){
        
    }
}

fun foo(){
    val arrayList = listOf("foo","bar").toMutableList()
    arrayList.forEach{
        print(it)
    }
    for (string in arrayList){
        print(string)
    }
}