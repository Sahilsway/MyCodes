
// let fNum = Math.floor(3.14)
// let fNum = Math.floor(Math.random() * 6) + 1
// const divEl = document.querySelector("#div-el")
// divEl.innerHTML = "<button id='btn-el'>Buy!</button>"
// const btnEl = document.querySelector("#btn-el")
// btnEl.addEventListener("click", function() {
//     divEl.innerHTML += "<p>Thank you for buying</p>"
// })

// const recipient = "Alex"
// const sender = "Swargiary"
// const email = `Hey ${recipient}! How is it going? Cheers ${sender}`
// console.log(email)

// console.log(Boolean(""))    //false
// console.log(Boolean("0"))   //true
// console.log(Boolean(100))   //true
// console.log(Boolean(null))  //false
// console.log(Boolean([0]))   //true
// console.log(Boolean(-0))    //false

// function greetingUser(greeting, name) {
//     let x = `${greeting}! ${name}.`
//     console.log(x)
// }
// greetingUser("Hi", "Swargiary")
// function add(num1, num2) {
//     return num1 + num2
// }
// console.log(add(3, 4))
// console.log(add(9, 102))

// *******************RECAP PRACTICE*******************

/*
const player = "Sahil"
const opponent = "James"
const game = "AmazingFighter"
let points = 0
let hasWon = false
points += 100
hasWon = false
if(hasWon) {
    // template literal
    console.log(`${player} got ${points} points and won the ${game} game!`)
}else {
    console.log(`The winner is ${opponent}! ${player} lost the game`)
}

// arr output
let myCourse = ["Learn css animation", "UI design fundamentals", "Intro to clean code"]
function printArr(arr) {
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i])
    }
}
printArr(myCourse)

// working with mini database that is localStorage
localStorage.setItem("names", "Sahil")
localStorage.clear()
console.log(localStorage.getItem("names"))

//DOM
let data = [
    {
        player: "James",
        score: 52
    },
    {
        player: "Mark",
        score: 41
    }
]
const Btn = document.querySelector("#btn-el")
Btn.addEventListener("click", function() {
    console.log(`James score is ${data[0].score}`)
})

// working with arrays
function genSentence(str, arr) {
    let fStr = `The ${arr.length} ${str} are `
        for(let i = 0; i < arr.length; i++) {
            if (i === arr.length-1) {
                fStr += arr[i]
            } else {
                fStr += arr[i] + ", "
            }
        }
        return fStr
}
const rtrn = genSentence("best fruits", ["Apple", "Bannana"])
console.log(rtrn)
*/
// rendering images through javascript
const teamImgs = [
    "profile_photo/img1.jpg",
    "profile_photo/img2.jpg",
    "profile_photo/img3.jpg",
]
const container = document.querySelector("#container")
let imgDom = ""
function renderImgs() {
    for (let i = 0; i < teamImgs.length; i++) {
       imgDom += `<img alt="Employee of the company" class="team-profile-img" src="${teamImgs[i]}">`
    }
    container.innerHTML = imgDom
}
renderImgs()