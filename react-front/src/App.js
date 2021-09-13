import logo from './logo.svg';
import './App.css';
import axios from 'axios'
import react, {useState, useEffect} from 'react'

function App() {
  useState(() => {
    axios.get('http://localhost:8808/post/posts/0', {
        headers: {
            credentials: 'include'
        }
    })
        .then(resp => {
          console.log(resp)
        }, [])
  });
  return (
    <div className="App">

    </div>
  );
}

export default App;
