fun main() {
    var toDoList= mutableListOf("Alahsa","Hafer Albaten","Hail")
    println(toDoList)
    toDoList.addAll(0,listOf("Riyadh"))
    toDoList.addAll(1,listOf("Makkah"))
    println(toDoList)
}