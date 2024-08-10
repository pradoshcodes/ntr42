import React, { Fragment, useState } from "react";
let Counter=()=>{

    let [count,setcount]=useState(1)

    return <Fragment>
        <h1>{count}</h1>
        <button onClick={()=>{setcount(count+1)}}>Plus</button>
        <button onClick={()=>{setcount(count-1)}}>Minus</button>
    </Fragment>
}
export default Counter;