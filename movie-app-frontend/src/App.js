import logo from './logo.svg';
import './App.css';
import api from './api/axiosConfig';
import {useState, useEffect} from 'react';
import Layout from './components/Layout';
import {Routes, Route} from 'react-router-dom';
import Home from './components/home/Home';
import Header from './components/header/Header';

function App() {
  const [movies, setMovies] = useState();
  // const [movie, setMovie] = useState();
  // const [reviews, setReviews] = useState([]);



  const getMovies = async () =>{
    
    try
    {

      const response = await api.get("api/v1/movies/getAllMovies");
      console.log("data : ",response.data)
      setMovies(response.data);

    } 
    catch(err)
    {
      console.log(err);
    }
  }



  useEffect(() => {
    getMovies();
  },[])

  return (
    <div className="App">
      <header className="App-header">
      <Header/>
      <Routes>
          <Route path="/" element={<Layout/>}>
            <Route path="/" element={<Home movies={movies} />} ></Route>
            {/* <Route path="/Trailer/:ytTrailerId" element={<Trailer/>}></Route>
            <Route path="/Reviews/:movieId" element ={<Reviews getMovieData = {getMovieData} movie={movie} reviews ={reviews} setReviews = {setReviews} />}></Route>
            <Route path="*" element = {<NotFound/>}></Route> */}
          </Route>
      </Routes>
      </header>
    </div>
  );
}

export default App;
