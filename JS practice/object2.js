let emp={
    eid:101,
    ename:"rahul",
    esal:45000
}
//  console.log(JSON.stringify(emp));//to display the object in browser we use

//console.log(Object.keys(emp).length);//we are fetching object in the form of array.

if(Object.values(emp).length){
    console.log("not empty");
}else{
    console.log("empty");
}