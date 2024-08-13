import React, { useState } from "react";

function ProductCounter() {
    let [products, setProducts] = useState(1);
    
    return (
        <React.Fragment>
            <h2>How many products: {products}</h2>
            <button 
                onClick={() => { setProducts(products + 1); }} 
                className="btn btn-outline-primary"
                style={{ marginRight: '10px' }} // Add margin to the right
            >
                Plus(+)
            </button>
            <button 
                onClick={() => { setProducts(products - 1); }} 
                className="btn btn-outline-danger"
            >
                Minus(-)
            </button>
        </React.Fragment>
    );
}

export default ProductCounter;
