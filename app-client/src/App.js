import Header from "./layout/Header";
import Navbar from "./layout/Navbar";
import { BrowserRouter as Router } from "react-router-dom";
import RecipeCard from "./components/RecipeCard.js";
import Account from "./components/Account.js";
import axios from 'axios';
import "./app.css"
import { useEffect, useState } from "react";


let api = axios.create({
  baseURL: "http://localhost:8080"
})

function App() {
  const [recipes,setRecipes] = useState([])
  const [user,setUser] = useState({})
  useEffect(()=>{
    api.get("/recipes/get")
    .then((response)=>{
      setRecipes(response.data)
    })
    .catch(err=>console.log(err))
  }, [])
  useEffect(()=>{
    api.get("/user/get/1")
    .then((response)=>{
      setUser(response.data)
    })
    .catch(err=>console.log(err))
  }, [])
  return (
    <div className="App">
      <Router>
        <Header className='header' />
        <div class="recipe-card">
          <Account user={user}></Account>
          {
              recipes.map( (recipe)=>  {
                  return <RecipeCard recipe={recipe}></RecipeCard>
                }
              )
            }
         </div> 
        <Navbar />
      </Router>
    </div>
  );
}

export default App;
