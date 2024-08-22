 let arr=[23,20,30,54,67,48,2,89,33]
// let even=[]

// for(num of arr){
//     if(num%2==0){
//         even.push(num)
//     }
// }
// console.log(even);

let even=arr.filter((num)=>{
    return num%2==0
})
console.log(even);