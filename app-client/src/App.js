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
  const [isRecipe, setIsRecipe] = useState(true)
  const [isAccount, setIsAccount]= useState(false)
  const [isFavorite, setIsFavorite] = useState(false)
  const [userFavorites, setUserFavorites ] = useState([])
  const [recipes,setRecipes] = useState([])
  const [user,setUser] = useState({})
  useEffect(()=>{
    api.get("/recipes/get")
    .then((response)=>{
      console.log(response.data)
      setRecipes(response.data)
    })
    .catch(err=>console.log(err))
  }, [])
  useEffect(()=>{
    api.get("/user/get/1")
    .then((response)=>{
      console.log(response.data)
      setUser(response.data)
    })
    .catch(err=>console.log(err))
  }, [])

  useEffect(()=>{
    api.get("/favorites/get/1")
    .then(response =>{
      setUserFavorites(response.data)
    })
  }, [])
  return (
    <div className="App">
      <Router>
        <Header className='header' />
        <div className="recipe-card">
          {isAccount && <Account user={user}></Account>}
          {isRecipe && 
            recipes.map( (recipe)=>  {
             return <RecipeCard recipe={recipe}></RecipeCard>
            }
            )
          }
          {isFavorite &&  
            userFavorites.map((recipe)=>  {
              return <RecipeCard recipe={recipe}></RecipeCard>
            }
            )
          }
         </div> 
        <Navbar setIsAccount={setIsAccount} setIsFavorite={setIsFavorite} setIsRecipe={setIsRecipe} />
      </Router>
    </div>
  );
}

export default App;
