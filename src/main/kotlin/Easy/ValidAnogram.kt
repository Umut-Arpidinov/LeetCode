package Easy

class ValidAnagram {
    fun isAnagram(s: String, t: String): Int{
        var count = 0
        val se = s.toSet()
        for(i in se.indices) {
            count = s.count{ it == se.elementAt(i)}
        }
        return count
    }

}

fun main() {
    val valid = ValidAnagram()
    println(valid.isAnagram("ass","bss"))
}