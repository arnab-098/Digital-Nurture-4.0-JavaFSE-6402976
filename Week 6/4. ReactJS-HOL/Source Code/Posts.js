import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
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
                const postObjects = data.map(
                    p => new Post(p.userId, p.id, p.title, p.body)
                );
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

    componentDidCatch(error, info) {
        console.error('Error in Posts component: ', error, info);
        alert('An error occurred while loading posts');
        this.setState({ hasError: true });
    }

    render() {
        const { posts, hasError } = this.state;

        if (hasError) {
            return <h2>Something went wrong while loading posts</h2>
        }

        return (
            <div>
                <h1>Blog Posts</h1>
                {posts.map(post => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;
