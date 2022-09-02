var num1; // Global Variabel to use in Functions setOP & press  . 
var x; // Global Variabel to use in Functions setOP & press  . 
var clear = document.querySelector("#display")
function clr() {
    clear.innerText = "0";
}
function press(n) {
    if (clear.innerText == 0) {
        clear.innerText = "";
    }
    if (clear.innerText == x ){ //to keep x visible on display screen . 
        clear.innerText = ""
    }
    clear.innerText = clear.innerText + n; //to input mora than one digit on display screen .  
    num1 = Number(clear.innerText); // here Number convert the text to number .  
    return num1;
}
function setOP(t) {
    x = Number(clear.innerText); // ---> x = num1 . 
    clear.innerText = num1 ;
    t1 = t;
    return t1;
}
// insert num1 again --> num1 = new num1 .
function calculate() {
    if (t1 == '/') {
        clear.innerText = x / num1;
    }
    if (t1 == '+') {
        clear.innerText = x + num1;
    }
    if (t1 == '*') {
        clear.innerText = x * num1;
    }
    if (t1 == '-') {
        clear.innerText = x - num1;
    }
}