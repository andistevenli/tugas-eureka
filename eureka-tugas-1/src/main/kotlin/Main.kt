fun main(args: Array<String>) {
    val minggu = arrayOf("Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu");
    print("Seminggu terdiri dari hari: ")

    for (seminggu in minggu){
        when{
            seminggu=="Minggu" -> println("dan, $seminggu")
            else -> print("$seminggu, ")
        }
    }
    print("Bilangan ");
    var i =1;
    while (i<10){
        when{
            i==9 -> println("dan $i adalah bilangan asli.")
            else -> print("$i, ")
        }
        i++;
    }
}