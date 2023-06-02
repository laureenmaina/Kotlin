fun main(){
    var languages= arrayOf("Python","Kotlin","Java")
    println(languages[0])

    languages[0]="Javascript" //changing an element
    println(languages[0])

    for(l in languages)
    println(l)

    var language=languages.plus(element = "C")
    for (lang in language)
        println(lang)

    println(languages.size)
}