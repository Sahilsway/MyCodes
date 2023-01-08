
let number = Math.floor(Math.random() * 100) + 1
let num = prompt("Enter a number")
num = Number.parseInt(num)
let guesses = 1
do {
    if (num > number) {
        num = prompt("Enter a smaller number")
        num = Number.parseInt(num)
        guesses++
    } else {
        num = prompt("Enter a greater number")
        num = Number.parseInt(num)
        guesses++
    }
}while(num != number)
console.log("Booyah!")
console.log(`You took ${guesses} chances to guess the right number`)
console.log(`And the right number is ${number}`)
