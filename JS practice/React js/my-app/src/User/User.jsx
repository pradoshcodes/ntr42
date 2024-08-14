import { Axios } from "axios";
import React from "react";

class User extends React.Component{
    users=[]
    constructor(props){
        super(props)
        this.state={
            users:[]
        }
    }
    getUserData=()=>{
        Axios.get('https://jsonplaceholder.typicode.com/users')
        .then((resp)=>{
            console.log(resp.data);
            this.setState({users:resp.data})
        })
        .catch()
    }

    render(){
        return <div>
            <pre>{JSON.stringify(this.state.users)}</pre>
            <h2>User Component</h2>
            <button onClick={this.getUserData}>Get User Data</button>
            <hr/>
            <table border={2}>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.users.length >0 ? <div>
                            {
                                this.state.users.map((user)=>{
                                    return <tr >
                                        <td>{user.id}</td>
                                        <td>{user.name}</td>
                                        <td>{user.email}</td>
                                    </tr>
                                })
                            }
                        </div> : <div><h3 style={{backgroundColor:'red'}}>No Data</h3></div>
                    }
                </tbody>
            </table>
        </div>

    }
}
export default User; 