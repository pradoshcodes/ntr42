import { useState } from "react"

let login=()=>{
    let [user,setuser]=useState({username:"",password:""})

    let updateHandler = (event) => {
        setuser({ ...user, [event.target.name]: event.target.name });
      };

      let submitHandler=(event)=>{
        event.preventDefault();
        console.log(user);
    
      }

      return (
        <>
          <div className="row">
            <div className="col-5">
              <h4>{JSON.stringify(user)}</h4>
              <form onSubmit={submitHandler}>
                <br />
                <div className="form-group">
                  <label>Email :</label>
                  <input
                    className="form-control"
                    type="email"
                    onChange={updateHandler} name="email"
                  />
                  <br />
                  <br />
                </div>
    
                <div className="form-group">
                  <label>Password :</label>
                  <input
                    className="form-control"
                    type="password"
                    onChange={updateHandler} name="password" 
                  />
                  <br />
                  <br />
                </div>
    
                <input type="button" value="login" className="btn btn-warning"/>
              </form>
            </div>
          </div>
        </>
      );
    };
    export default Login2;

}