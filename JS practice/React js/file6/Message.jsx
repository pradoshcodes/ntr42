import React, { Fragment, useState } from "react";

let Message = () => {
  let [msg, setmsg] = useState("hello");

  let update = (value) => {
    setmsg(value);
  };

  return (
    <Fragment>
      <h1>{msg}</h1>
      <button onClick={update.bind(null, "hello prostack")}>click</button>
      <button onClick={update.bind(null, "hello GreetLab")}>click me</button>
      <button onClick={()=>{setmsg("hello Vigor")}}>Click here</button>
    </Fragment>
  );
}
// class Message extends React.Component{

//     state={
//         msg:"hello"
//     }

//     constructor(props){
//         super(props);
//     }


//     update=(value)=>{
//         this.setState({msg:value})
//     }

//     render(){
//         return <Fragment>
//                 <h1>{this.state.msg}</h1>
//                 <button onClick={this.update.bind(this,"Hello prostack")}>Click me</button>
//                 <button onClick={this.update.bind(this,"Hello GreetLab")}>Click me</button>

//         </Fragment>
//     }
// }
export default Message;