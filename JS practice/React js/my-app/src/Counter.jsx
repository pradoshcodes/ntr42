import React from "react";
class Counter extends React.Component{

    state={
        counter:1
    }

    incr=()=>{
        this.setState({counter:this.state.counter+1})
    }
    desc=()=>{
        this.setState({counter:this.state.counter-1})
    }

    render(){
        return <React.Fragment>
            <h2>{this.state.counter}</h2>
            <button onClick={this.incr}>+</button>
            <button onClick={this.desc}>-</button>
        </React.Fragment>
    }
}
export default Counter;