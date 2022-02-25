import Header from "./layout/Header";
import Navbar from "./layout/Navbar";
import { BrowserRouter as Router } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <Router>
        <Header />
        <Navbar />
      </Router>
    </div>
  );
}

export default App;
