fun main(){
    myList("Joan", "Wendy", "Velonica", "Lilian")
    world("harere", "mumbai", "dodoma", "jakarta")
    nums(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var record = students("Winnie", "William", "Meghan")
    println(record)


}
//a function that takes in 4 strings  and creates an array out of them then
//prints out the array

fun myList(a:String, b:String, c:String, d:String){
    var name = arrayOf(a,b,c,d)
    var customers = name.contentToString()
    println(customers)
}

//a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun world(a:String, b:String, c:String, d:String){
    var cities = arrayOf(a, b, c, d)
    for (caps in cities){
        println(caps.capitalize())
    }
}

//one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//prints out the sum of the second and fifth elements

fun nums(a:Int, b:Int, c:Int,d:Int, f:Int, e:Int, g:Int, h:Int, i:Int, j:Int, k:Int,l:Int, m:Int){
    var numbers = arrayOf(a,b,c,d,e,f,g,h,i,j,k,l,m)
    var sum = numbers[2]+numbers[4]
    println(sum)

    //(prints out the index of 158
    println(numbers[11])

    //prints out the elements in ascending order
    var sortedNumbers2 =numbers.sortedArray()
    println(sortedNumbers2.contentToString() )
}

//a function that takes in 3 names and returns a string array containing
//all 3 names
fun students(q: String, f: String, w: String):String{
    var names = arrayOf(q,f,w)
    var members =names.contentToString()
    return members

}