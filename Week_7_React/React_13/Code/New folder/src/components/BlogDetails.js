import React from 'react';

function BlogDetails({ blog }) {
  return blog ? (
    <div>
      <h2>Blog Details</h2>
      <p><b>Title</b> : {blog.title}</p>
      <p><b>Author</b> : {blog.author}</p>
      <p><b>Content</b> : {blog.content}</p>
    </div>
  ) : (
    <div>No blog selected</div>
  );
}

export default BlogDetails;