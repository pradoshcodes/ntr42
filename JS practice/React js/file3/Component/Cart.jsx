let Cart=(props)=>{

    return  <React.Fragment>
        <h2>Cart Component</h2>
        <h2>Product Id:{JSON.stringify(props.products.pid)}</h2>
        <h2>Product Name:{JSON.stringify(props.products.pname)}</h2>
        <h2>Product Proce:{JSON.stringify(props.products.p_price)}</h2>
        <h2>Product Color:{JSON.stringify(props.products. color)}</h2>
        <img src={props.products.p_image}/>       
    </React.Fragment>
}
export default Cart;