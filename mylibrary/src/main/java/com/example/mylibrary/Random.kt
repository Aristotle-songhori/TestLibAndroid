package com.example.mylibrary

import java.util.concurrent.ThreadLocalRandom

class Random {

    fun generateRandomNumber(a: Int, b: Int): Int {
//        require(a < b) { "The first argument should be less than the second argument." }
      if (a < b) {
          return kotlin.random.Random.nextInt(b, a)
      }else{
          return kotlin.random.Random.nextInt(a, b)
      }
    }

    fun generateRandomPassword(passwordLength:Int): String {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9') + listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=')
        return (1..passwordLength)
            .map { kotlin.random.Random.nextInt(0, charPool.size) }
            .map(charPool::get)
            .joinToString("")
    }




}