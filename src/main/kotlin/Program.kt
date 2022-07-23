import com.rsk.Providers

fun main(args: Array<String>){

    val providers = Providers()
    val details = providers.getAllProviders()

    details.forEach(::println)
//    this is a higher order function. I don't know what that means yet.
//    other higher order functions include: map
//    map changes one collection into another
//    getAllProviders{
//        key, value -> println("\t---$key: $value")
//    }
}

fun getAllProviders(fn: (String, String) -> Unit){
    val allProviders = Providers.getProviders()
    val it = allProviders.iterator()

    while (it.hasNext()){
        val provider = it.next()
        println(provider.name)
        provider.forEach { key, value -> fn(key.toString(), value.toString()) }
    }
}

fun listProvidersInstance(){
    val providers = Providers()
    val allProviders = providers.getProviders()

    val it = allProviders.iterator()

    while (it.hasNext()){
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value") }
    }
}

fun listProviders(){
    val providers = getProviders()
    val it = providers.iterator()

    while (it.hasNext()){
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value") }
    }
}