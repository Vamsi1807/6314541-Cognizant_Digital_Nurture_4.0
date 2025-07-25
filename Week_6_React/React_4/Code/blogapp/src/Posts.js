import React from 'react';
import Post from './Post'; 

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const postObjects = data.map(p => new Post(p.id, p.title, p.body));
                this.setState({ posts: postObjects });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
                this.setState({ hasError: true });
            });
    };

    componentDidMount() {
        this.loadPosts();
    }

    render() {
        if (this.state.hasError) {
            return <h2>Something went wrong while fetching posts.</h2>;
        }

        return (
            <div>
                <h1>All Posts</h1>
                {this.state.posts.map((post) => (
                    <div key={post.id}>
                        <h2>Post id : {post.id}</h2><h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr/>
                    </div>
                ))}
            </div>
        );
    }

    componentDidCatch(error, info) {
        alert("Error occurred while rendering the component.");
        console.error("Error caught: ", error, info);
    }

}

export default Posts;
