import React from "react";
import Message from "./Message";
class App extends React.Component{

    render(){//to override the render method to return UI
        return <div>
            <h2>hello React js
            </h2>
            <hr/>
            <Message/>
        </div>
    }
}
export default App;