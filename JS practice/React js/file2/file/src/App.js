import React from "react";
import Header from "./Header";
import Footer from "./Footer";
import Slider from "./Slider";
class App extends React.Component{

    render(){//to override the render method to return UI
        return <div>
          
        <h1>App </h1>
        <Header/>
        <hr/>
        <Footer/>
        <hr/>
        <Slider/>

        </div>
    }
}
export default App;