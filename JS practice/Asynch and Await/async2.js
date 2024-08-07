let employee=[
    {name:"John",age:30,city:"New York"},
    {name:"Alice",age:25,city:"Los Angeles"},
    {name:"Bob",age:35,city:"Chicago"},
    {name:"Charlie",age:40,city:"Houston"},
    {name:"David",age:45,city:"Seattle"},
    {name:"Frank",age:55,city:"Denver"},
    {name:"George",age:60,city:"San Francisco"},
]


let createEmployeee=(emp)=>{
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
            let flag=true;
            employee.push(emp);
            flag=true?resolve("sucess"):reject("failed")
            resolve(emp)
    },4000)
})
}

let getEmployee=()=>{

    setTimeout(()=>{

        let rows=""
        employee.forEach((emp)=>{
          rows+=`<tr><td>${emp.name}</td><td>${emp.age}</td><td>${emp.city}</td></tr>`; 
          })
          document.getElementById("data").innerHTML=rows
    },2000)
}
createEmployeee({name:"Eve",age:50,city:"Boston"})
.then((msg)=>{console.log(msg)})
.catch((err)=>{console.log(err)})

getEmployee()