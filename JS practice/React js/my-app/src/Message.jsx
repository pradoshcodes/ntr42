import React from "react";

class Message extends React.Component{
    msg="Hello"

    gnHandler=()=>{
        this.msg="Hello ProstackAcademy"
        this.forceUpdate();//execute the render method one more time
    }

    gmHandler=()=>{
        this.msg="Hello GreetLab"
        this.forceUpdate();
    }

    render(){
        return <React.Fragment>
            <h2>This is Message </h2>
            <h2>Wish Message:{this.msg}</h2>
            <button onClick={this.gnHandler}>GN</button>
            <button onClick={this.gmHandler}>GM</button>
        </React.Fragment>
    }

}
export default Message;