
// Question 1: Calculate the sum of numbers within an array


let numbers = [1, 5, 33, 41, 100];                  // create an array
let sum = 0;                                      // create a variable for the sum and initialize it
for (let i = 0; i < numbers.length; i++ ) {       // iterate over each item in the array
  sum += numbers[i];
}

console.log(sum) 