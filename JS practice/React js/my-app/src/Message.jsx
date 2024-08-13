import React, { Fragment, useState } from "react";

function Message(){

  let[msg,setmsg]=useState("Hello")
   let gnhandler=()=>{
       setmsg("Good Morning")
    }


    
        return <Fragment>
            <h1>Message Component</h1>
            <h2>{msg}</h2>
            <button onClick={gnhandler}>Morning</button>
            <button onClick={()=>{setmsg("Good Morning")}}>Night</button>
        </Fragment>
    }

export default Message;