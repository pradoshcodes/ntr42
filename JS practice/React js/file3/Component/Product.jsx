import React, { Fragment } from "react";
import Cart from "./Cart";
class Product extends React.Component{

    products={
        pid:"101",
        pname:"Iphone se",
        p_price:"5000000",
        color:['red','white','blue'],
        p_image:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbgAx-MSzmkQiZL4j27yCulqYJtWnf0PAPAA&s"
    };

    constructor(props){
        super(props);
        
    }

    render(){

        return <Fragment>
            <h2>Product Component</h2>
            <Cart products={this.products}/>
            </Fragment>
    }
}
export default Product;