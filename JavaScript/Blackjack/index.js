
let cards = []
let sum = 0
let hasBlackjack = false
let isAlive = false
let message = ""

// let messageEl = document.getElementById("message-el")
let messageEl = document.querySelector("#message-el")
let sumEl = document.querySelector("#sum-el")
let cardEl = document.querySelector("#card-el")
let playerEl = document.querySelector("#player-el");
let player = {
    name: "Sahil",
    chips: 145
}

playerEl.textContent = player.name + ": $" + player.chips

function startGame(){
    let firstCard = getRandomCard()
    let secondCard = getRandomCard()
    cards.push(firstCard)
    cards.push(secondCard)
    sum += firstCard
    sum += secondCard
    isAlive = true
    renderGame()
    
}

function renderGame() {
    cardEl.textContent = "Cards: "
    for (let i = 0; i < cards.length; i++) {
        cardEl.textContent += cards[i] + " "
    }
    sumEl.textContent = "Sum: " + sum

    if(sum <= 20) {
        message = "Do you want to draw a new card?"
    }else if(sum === 21) {
        message = "Booyah! you have got blackjack"
        hasBlackjack = true
    }else {
        message = "You are out! Better luck next time"
        isAlive = false
    }
    
    messageEl.textContent = message
}

function newCard() {
    if (isAlive && !hasBlackjack) {
        let card = getRandomCard()
        sum += card
        cards.push(card)
        renderGame()
    }
}

function getRandomCard() {
    let randomNum = Math.floor(Math.random() * 13) + 1
    if (randomNum == 1) {
        return 11
    }else if (randomNum > 10) {
        return 10
    }else {
        return randomNum
    }
}

console.log(cards)