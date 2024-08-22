import { useState } from "react";

let  Login=()=>{
    let [user,setuser]=useState({username:"",password:""});

    let updateEmail=()=>{
        setuser({Email:'rahul02@gmail.com'})
    }

    let UpdatePass=()=>{
        setuser({password:'xhdxn232'})
    }
    return <div>
        <h1>{JSON.stringify(user)}</h1>
        <form>
            <label>Email Id:</label>
            <input type="text" onChange={updateEmail}/> <br /><br />
            <label>Password:</label>
            <input type="text" onChange={UpdatePass}/><br /><br />
            <input type="submit" value="Login"/>
        </form>
    </div>
}
export default Login;