import React from "react";
import Employee from "./Employee";

class User extends React.Component {
     Uid=101
     Uname="Pradosh"
     Usalary=1000000
     Uloc=["chennai",  "bangalore", "BBSR"]
     render(){
    return (
        <div>
            <hr/>
            <Employee Id={this.Uid} Name={this.Uname} Salary={this.Usalary} Loc={this.Uloc}/>
            
            
        </div>
    );
};
}

export default User;
