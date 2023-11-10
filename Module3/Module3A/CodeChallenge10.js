
// Question 10:Create a function that filters out negative numbers.


// const numbers = [10, 20, 41, -12, 70, -1, -3.5, 55]
// const negativeNumbers = numbers.filter(n => n< 0)
// console.log(negativeNumbers)


function filternegativeNumbers(numbers) {
    return numbers.filter(n => n<= 0)
    
}
const originalnumber = [10, 20, 41, -12, 70, -1, -3.5, 55]
const nonNegativeNum = filternegativeNumbers(originalnumber)
console.log(nonNegativeNum)