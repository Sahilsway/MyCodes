
let pass = 1234
let ui
while(ui != pass) {
    ui = prompt('Enter your password')
    console.log(ui == pass? 'You have entered correct password' :'Try again')
}
