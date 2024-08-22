import { useState } from "react";

let Login = () => {
  let [user, setuser] = useState({ username: "", password: "" });

  let updateemail = (event) => {
    setuser({ ...user, email: event.target.value });
  };
  let updatepass = (event) => {
    setuser({ ...user, password: event.target.value });
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
                onChange={updateemail}
              />
              <br />
              <br />
            </div>

            <div className="form-group">
              <label>Password :</label>
              <input
                className="form-control"
                type="password"
                onChange={updatepass}
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
export default Login;
