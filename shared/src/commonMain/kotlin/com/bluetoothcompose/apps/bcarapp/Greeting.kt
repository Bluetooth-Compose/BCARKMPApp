package com.bluetoothcompose.apps.bcarapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}