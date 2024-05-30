//A group of values as one entity .
//allowed heterogeneous and duplicate elements
//elements are stored based indexing.
//To read an array by using indexing
//js array is itrable object 
//-ve index is not possible 

let a=[]//empty object
console.log(typeof a)//Object

let enames=['rahul','rohan','gyan','hari','ram']
console.log(enames)
console.log(enames[0])
console.log(enames[1])
console.log(enames[2])
console.log(enames[3])

enames[0]="Dinesh"
//update an array
enames.unshift()


console.log(enames)

let b=[10,10,10]

let names={
    id:101,
    name:"rahul",
    name:"rohan",
    name:"rohit",
    
}
console.log(b);
console.log(names);