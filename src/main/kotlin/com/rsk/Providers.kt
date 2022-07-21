package com.rsk

import java.security.Provider
import java.security.Security

class Providers {
    fun getProviders(): List<Provider>{
        val providers = Security.getProviders()
        val listOfProviders : List<Provider> = providers.asList()
        return listOfProviders
    }

    companion object{
        fun getProviders(): List<Provider>{
            val providers = Security.getProviders()
            val listOfProviders : List<Provider> = providers.asList()
            return listOfProviders
        }
    }
}