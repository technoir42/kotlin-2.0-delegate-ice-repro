package com.example.library

class DerivedImpl(
    private val delegate: SimpleDerived
) : Derived by delegate
