
const arr = ['stone', 'paper', 'scisor']
let runConfirm = true
while(runConfirm) {
    let c = arr[Math.floor(Math.random()*arr.length)]
    let u = prompt("stone/paper/scisor?")
    if (c == 'stone' && u == 'stone') {
        console.log("Its a draw.")
    } else if (c == 'stone' && u == 'paper') {
        console.log("You won.")
    } else if (c == 'stone' && u == 'scisor') {
        console.log("You lose.")
    } else if (c == 'paper' && u == 'stone') {
        console.log("You lose.")
    } else if (c == 'paper' && u == 'paper') {
        console.log("Its a draw.")
    } else if (c == 'paper' && u == 'scisor') {
        console.log("You won.")
    } else if (c == 'scisor' && u == 'stone') {
        console.log("You won.")
    } else if (c == 'scisor' && u == 'paper') {
        console.log("You lose.")
    } else if (c == 'scisor' && u == 'scisor') {
        console.log("Its a draw.")
    }
    runConfirm = confirm("Do you wanna play again?")
}
