import './App.css';
import api from './API/axiosConfig';
import {useState, useEffect} from 'react';
import Layout from './components/Layout';
import {Routes, Route} from 'react-router-dom';
import Home from './components/home/Home';
import Header from './components/header/Header';
import Trailer from './components/trailer/Trailer';
function App() {

  const[games, setGames] = useState();

  //handles http request to an endpoint that returns and array of data
  const getGames = async () =>{
    try
    {
      const response = await api.get("/api/v1/games");
      setGames(response.data);
    } 
    catch(err)
    {
      console.log(err);
    }
  }

  useEffect(() => {
    getGames();
  },[])


  return (
    <div className="App">
      <Header></Header>
      <Routes>
        <Route path ="/" element={<Layout/>}>
          <Route path ="/" element = {<Home games={games}/>}></Route>
          <Route path = "/Trailer/:ytTrailerId" element={<Trailer/>}></Route>
        </Route>
      </Routes>
    </div>
  );
}

export default App;
