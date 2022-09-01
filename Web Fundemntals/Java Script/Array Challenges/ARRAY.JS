function alwaysHungry(arr) {
    var c=0;
    for (var i=0;i<=arr.length;i++){
        if(arr[i]=="food"){
            console.log("Yummi");
            c++;
        } 
    }
    if(c==0){
        console.log("Im hungry")
    }

}
alwaysHungry([3.14, "food", "pie", true, "food"]);
// this should console log "yummy", "yummy"
alwaysHungry([4, 1, 5, 7, 2]);
// this should console log "I'm hungry"

////////

function highPass(arr, cutoff) {
    var filteredArr = [];
    for (var i=0;i<=arr.length;i++){
        if(arr[i]>cutoff){
            filteredArr.push(arr[i]);
        }
    }
    return filteredArr;
}
var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log(result); // we expect back [6, 8, 10, 9]



function betterThanAverage(arr) {
    var sum = 0;
    var count =0;;
    for (var i=0 ; i < arr.length; i++){
        sum+=arr[i];
    }
    var avg=sum/(arr.length);
    
    for (var j =0; j < arr.length;j++){
        if(arr[j] > avg){
            count+=1;
        }
        
    }
    return count;
    // count how many values are greated than the average
    
}
var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result); // we expect back 4
var result2 = betterThanAverage([2,4,6]);
console.log(result2);

///////////////////

function reverse(arr) {
    var arr1=[];
    for(var i=0;i<arr.length;i++){
        arr1.push(arr[i]);
        
    }
    arr1.reverse();
    return arr1;
}
   
var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back ["e", "d", "c", "b", "a"]
var result1 = reverse(["t1", "t4", "t7", "t8", "t9"]);
console.log(result1); 


function fibonacciArray(n) {
    // the [0, 1] are the starting values of the array to calculate the rest from
    var fibArr = [0, 1];
    for(var i=2;i<n;i++) {
        fibArr[i]=fibArr[i-2]+fibArr[i-1];
     //   fibArr.push(fibArr[n]);
       
    }
    return fibArr;
}
   
var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34];


