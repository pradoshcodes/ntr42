import React from "react";
import Employee from "./Employee";

class User extends React.Component {
     Uid=101
     Uname="Pradosh"
     Usalary=1000000
     Udetails={
            "email":"prostack@gmail.com",
            "location":"bangalore"
     }
     render(){
    return (
        <div>
            <hr/>
            <Employee Id={this.Uid} Name={this.Uname} Salary={this.Usalary} Details={this.Udetails}/>
            
            
        </div>
    );
};
}

export default User;
