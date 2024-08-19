import React, { Fragment, useState } from "react";

function Message(){

  let[msg,setmsg]=useState("Hello")

   let gnhandler=(value)=>{
       setmsg(value)
    }


    
        return <Fragment>
            <h1>Message Component</h1>
            <h2 className="badge text-wrap fs-1" style={{width: '15rem', height:"7rem", backgroundColor: msg === "Good Night" ? "black" : msg === "Good Morning" ? "blue" : "red" }}>{msg}</h2><br />
            <button onClick={gnhandler.bind(null,"Good Morning")}   className="btn btn-outline-primary"
                style={{ marginRight: '10px' }}>Morning</button>
            <button onClick={gnhandler.bind(null,"Good AfterNoon")}   className="btn btn-outline-success"
                style={{ marginRight: '10px' }}>After-Noon</button>
            <button onClick={gnhandler.bind(null,"Good Evening")}   className="btn btn-outline-danger"
                style={{ marginRight: '10px' }}>Evening</button>
            <button onClick={gnhandler.bind(null,"Good Night")}   className="btn btn-outline-dark"
                style={{ marginRight: '10px' }}>Night</button>
        </Fragment>
    }

export default Message;