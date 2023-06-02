fun main(){
    for (number in 10..15)
        println(number)
    for (letters in 'C'..'F')
        println(letters)

    for (numb in 1..10){
        if (numb==6){
            break
        }
        println("Number:$numb")
    }

    for (letter in 'A'..'D'){
        if (letter=='C'){
            continue
        }
        println("Letter:$letter")
    }
}