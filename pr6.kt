fun main(){
    //6.2
//    try {
//        var s=readln()!!.toString()
//        when {
//            (s.length!=4) ->println("Число должно быть четырехзанчным")
//            else ->{
//                var a = s!!.toInt()
//                var a1 = a / 1000
//                var a2 = (a % 1000) / 100
//                var a3 = (a % 100) / 10
//                var a4 = a % 10
//                when {
//                    (a1 + a2 == a3 + a4) -> println("Да они равны")
//                    else -> println("Нет не равны")
//            }
//        }
//       }
//    }catch (e:Exception){
//       println("Ввели  некоретное значение")
//    }



    //6.3
    try{
        println("1 girl")
        var a=readln()!!.toDouble()
        println("2 girl")
        var b=readln()!!.toDouble()
        when{
            (a<0.0||b<0.0)->println("Деньги не могут быть отрицательными")
            (a>b) -> println("первая сестра должна дать "+(((a+b)/2)-b)+" рублей второй")
            (a<b)->println("вторая сестра должна дать "+(((a+b)/2)-b)+" рублей первой")
            (a==b)->println("у девочек раное кол-во денег")
        }
    }catch (e:Exception){
  println("Ввели  некоретное значение")
    }


}
