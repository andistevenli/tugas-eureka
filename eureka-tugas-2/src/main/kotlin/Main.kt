fun isPalindrome(str: String): Boolean {
    var i: Int = 1;
    var j: Int = 0;
    str.lowercase();

    while (i<=str.length){
        if (str.substring(i-1,i)==str.substring(str.length-i,(str.length-i)+1)){
            j++;
        }
        i++;
    }
    if (j==str.length){
        return true;
    }else{
        return  false;
    }
}


fun main(args: Array<String>) {
    val kata: String="katak";

    if (isPalindrome(kata)){
        println("$kata adalah palindrom")
    }else{
        println("$kata bukan palindrom")
    }
}