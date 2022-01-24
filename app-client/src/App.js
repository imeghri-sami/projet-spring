

function App() {
  function fetchTest(){
     console.log("test  d");
  }
  return (

    <div className="App">
      <header className="App-header">
        {fetchTest()}
      </header>
    </div>

  );

}

export default App;
