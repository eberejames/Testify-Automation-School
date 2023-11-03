
//My Personal Library 2

const books = {
    title: "Love is not blind",
    description: "Love now wears wheelscreen",
    numberOfPages: 250,
    authour: "Love Doctor Not",
    reading: true,
    toggleReadingStatus: function(){
        if(books.reading===false) {
            books.reading = true
        }  else{
            books.reading = false
        }
    }

 }

 books.toggleReadingStatus()

 console.log(books.reading)