package com.rickandmorty.app.util.di.factory

class FactoryCreator {

    companion object{

        private var daggerFactory: DaggerFactory? = null

        fun createDaggerFactory(): DaggerFactory {
            if (daggerFactory == null) {
                daggerFactory = DaggerFactoryImpl()
            }
            return daggerFactory!!
        }
    }
}