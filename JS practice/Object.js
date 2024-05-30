//-group of key : value pairs as one entity
//group of property as one entity
//duplicate keys is not allowed
//indexing concept is not applicable


//js object is not iterable

let a={
    name:"sai",
    age:20,
    city:"hyd"

}
console.log(a.name);//how to access properties  =  (object-name.propert)
console.log(a.age);
console.log(a.city);
console.log(a.job);

a.name="Dinesh"

delete a.city;

console.log(a);