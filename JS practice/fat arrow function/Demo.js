// Normal function
//===================
function wish(name){
    return "Hello"+name

}
let r1=wish("rahul")
console.log(r1);


//Fat Arrow function
//==================
let wish=(name)=>{
    return "Hello"+name
}
let r=wish("rahul")
console.log(r);


//implicit function
//===================
let wish=name=>"Hello"+name
let r2=wish("rahul")
console.log(r2);
