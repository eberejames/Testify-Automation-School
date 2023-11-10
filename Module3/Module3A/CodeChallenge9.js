
//Question 9: Return the number of vowels in a string.

function numOfVowels (string) {
    let countVowels =0                       // initialise a counter for the number of vowels
    const vowels = ["a","e","i","o","u"]    //define an array of vowels
    for (let character of string) {         // iterates throuh each character
        if (vowels.includes(character)) {    // chec if the character is a vowel
            countVowels++ 
        }
    }
    return countVowels                        //return final count of vowels
    
}
let result = numOfVowels("interactive")
console.log(result)