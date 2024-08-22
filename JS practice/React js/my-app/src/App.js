import React from "react";

import { BrowserRouter, Link,Route,BrowserRouter as Router, Routes } from "react-router-dom";
import Home from './Page/Home';
import About from './Page/About';
import Service from './Page/Service';
import Login from "./Login/Login";
let App = ()=>{

    return <div>
        <BrowserRouter>
             <nav className="navbar  navbar-dark bg-dark navbar-brand-lg ">
                <Link to="/index" className="navbar-brand">Logo</Link>
                <div className="mx-auto">
                    <ul className="navbar-nav justify-content-center" >
                        <li className="nav-link"><Link to="/index">Home</Link></li>
                        <li className="nav-link"><Link to="/about">About</Link></li>
                        <li className="nav-link"><Link to="/Service">Service</Link></li>
                        <li><a href="/login">login</a></li>
                    </ul>
                </div>
             </nav>
             <Routes>
                <Route path="index" element={<Home/>}/>
                <Route path="About" element={<About/>}/>
                <Route path="Service" element={<Service/>}/>
                <Route path="/login" element={<Login/>}/>
             </Routes>
             </BrowserRouter>
            </div>
}

export default App
