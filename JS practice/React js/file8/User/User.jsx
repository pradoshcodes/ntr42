import Axios  from "axios";
import React, { Fragment } from "react";

class User extends React.Component{
    users=[]
    constructor(props){
        super(props)
        this.state={
            users:[]
        }
    }
    componentDidMount(){
        Axios.get('https://jsonplaceholder.typicode.com/users')
        .then((resp)=>{
            console.log(resp.data);
            this.setState({users:resp.data})
        })
        .catch(()=>{})
    }

    render(){
        return<>
            <pre>{JSON.stringify(this.state.users)}</pre>
            <h2>User Component</h2>
            {/* <button onClick={this.getUserData}>Get User Data</button> */}
            
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.users.length >0 ? <>
                            {
                                this.state.users.map((user,index)=>{
                                    return<tr >
                                        <td>{user.id}</td>
                                        <td>{user.name}</td>
                                        <td>{user.email}</td>
                                    </tr>
                                })
                            }
                        </> : <div><h3 style={{backgroundColor:'red'}}>No Data</h3></div>
                    }
                </tbody>
            </table>
        </> 

    }
}
export default User; 