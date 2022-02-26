import Header from "./layout/Header";
import Navbar from "./layout/Navbar";
import { BrowserRouter as Router } from "react-router-dom";
import RecipeCard from "./components/RecipeCard.js"
import "./app.css"
function App() {
  return (
    <div className="App">
      <Router>
        <Header className='header' />
        <div class="recipe-card">
          {
            
              [1,2,3,4,5,6,7,8,9].map( ()=>  {
                  return <RecipeCard className="recipe"></RecipeCard>
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
