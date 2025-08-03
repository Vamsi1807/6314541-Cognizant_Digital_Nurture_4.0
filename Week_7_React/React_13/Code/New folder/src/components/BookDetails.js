import React from 'react';

function BookDetails({ book }) {
  if (!book) {
    return <div>No book selected</div>;
  } else {
    return (
      <div>
        <h2>Book Details</h2>
        <p><b>Title</b> : {book.title}</p>
        <p><b>Author</b> : {book.author}</p>
        <p><b>Year</b> : {book.year}</p>
      </div>
    );
  }
}

export default BookDetails;