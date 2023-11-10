
//My Personal Library 3


const books = [
    {
title: "Love and Basketball",
description: "Love now wears wheelscreen",
numberOfPages: 250,
author: "Love Doctor Not",
reading: true,
},
{
title: "Love Doctor",
description: "Love is patient",
numberOfPages: 252,
author: "Love Doctor",
reading: false,
},
{
title: "Love Love",
description: "Love is wicked",
numberOfPages: 345,
author: "Love Stranger ",
reading: true,
},
{
title: "Love and Hate",
description: "Love is kind",
numberOfPages: 359,
author: " Doctor kim",
reading: true,
},

]

for(let numbers = 0; numbers < 5; numbers++) {
if(books[numbers].reading === true) {
console.log(books[numbers].title)
console.log(books[numbers].description)
console.log(books[numbers].numberOfPages)
console.log(books[numbers].author)
console.log("**************************")

}

}



