package ro.andreidobrescu.rapidroid.functional_interfaces

import java.lang.Exception

interface Supplier<T>
{
    @Throws(Exception::class)
    fun invoke() : T
}