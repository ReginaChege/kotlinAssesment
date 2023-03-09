fun main(){
  (numbers(99,89,56,80,90))
    (sen("my name is Regina"))
    println(combine("i","started","learning","kotlin","February"))

}

fun text(word1:String,word2:String){
   var senword="funtastic day"
}
fun numbers(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int){
    var numarray= arrayOf(num1,num2,num3,num4,num5)
    println(numarray)
    var minnumarray=numarray.min()
    println(minnumarray)
    var maxnumarray=numarray.max()
    println(maxnumarray)
    var averagenumarray=numarray.average()
    println(averagenumarray)
}
fun sen(text:String){
    var word=text
    var newword=word.split(",")
    println(newword)

}
fun combine(name1:String,name2:String,name3:String,name4:String,name5:String):String{
  var sentence="$name1  $name2  $name3  $name4  $name5"
    return sentence
}



