package com.example.unittest

class AssertTypePresenter {

    fun returnString(exampleString : String,  repeatedSize: Int): String{
        Thread.sleep(500);
        var str = exampleString
        val hashMap:HashMap<String,Int> = HashMap()
        var n = repeatedSize
        val ch = '*'
        var previousChar = ""
        var nextChar:String
        /** the count of occurrences of each character in the loop is set to hashmap */
        for (i in 0..str.length - 1) {
            var currentChar = str[i].toString()
            var count = hashMap.get(currentChar)
            if (count == null || currentChar != previousChar) {
                count = 0
            }

            /** previous and next character defined */
            previousChar = currentChar
            nextChar = if (i < (str.length - 1))  str[i + 1].toString() else ""

            /** count put hashmap */
            hashMap.put(currentChar, ++count)
            val stringBuilder = StringBuilder(str)

            /** it enters this loop when the number of repetitive characters is> = n and the next character is different.
            if these conditions are met, the characters are replaced "*" */
            if (count >= n && !nextChar.equals(currentChar)){
                for (j in i-count+1..i) {
                    stringBuilder.setCharAt(j, ch)
                }
            }
            str = stringBuilder.toString()
        }

        return str
    }

}