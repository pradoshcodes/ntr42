import { useEffect, useState } from "react";
import Axios  from "axios";

let User2=()=>{
    let[users,setuser]=useState([])

    useEffect(()=>{
        Axios.get('https://jsonplaceholder.typicode.com/users')
        .then((resp)=>{
            setuser({users:resp.data})
        })
        .catch(()=>{})
    },[])

    return<>
            <pre>{JSON.stringify(users)}</pre>
            <h2>User Component</h2>

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
                       
                        users.length >0 ? <>
                            {
                                users.map((user,index)=>{
                                    return<tr key={index}>
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
export default User2