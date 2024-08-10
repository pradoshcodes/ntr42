import React, { Fragment, useState } from "react";
let Message=()=>{

    let [msg,setmsg]=useState("Hello")

    let sender=()=>{
        setmsg("Hello from sender")
    }
    let receiver=()=>{
        setmsg("Hello from receiver")
    }

    return <Fragment>
        <h1>{msg}</h1>
        <button onClick={sender}>hy</button>
        <button onClick={receiver}>hi</button>
    </Fragment>
}
export default Message