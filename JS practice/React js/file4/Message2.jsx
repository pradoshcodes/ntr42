import React, { Fragment } from "react";
class Message extends React.Component{

    state={
        msg:"Hello"
    }

    render(){
        return <Fragment>
            <h1>{this.state.msg}</h1>
            <button onClick={()=>{this.setState({msg:"Bekar pila"})}}>Good</button>
            <button onClick={()=>{this.setState({msg:"Bhala pila"})}}>bad</button>

        </Fragment>
    }
}
export default Message;