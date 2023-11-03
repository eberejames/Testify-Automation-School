
//My Personal Library 3


const books = [
    {
title: "Love and Basketball",
description: "Love now wears wheelscreen",
numberOfPages: 250,
authour: "Love Doctor Not",
reading: true,
},
{
title: "Love Doctor",
description: "Love is patient",
numberOfPages: 252,
authour: "Love Doctor",
reading: false,
},
{
title: "Love Love",
description: "Love is wicked",
numberOfPages: 345,
authour: "Love Stranger ",
reading: true,
},
{
title: "Love and Hate",
description: "Love is kind",
numberOfPages: 359,
authour: " Doctor kim",
reading: true,
},

]

for(let numbers = 0; numbers < 5; numbers++)
{
if(books[numbers].reading===true){
console.log("The title of this book is " +books[numbers].title)
console.log("The book's description is " +books[numbers].description)
console.log("The book's page number is " +books[numbers].numberOfPages)
console.log("The book's author is " +books[numbers].authour)
console.log("**************************")

}

}






