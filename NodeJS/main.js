
// function sayHello(name) {
//     console.log("Hello " + name)
// }
// sayHello("Sahil")

// var message = ''
// console.log(global.message)

    //Module info
// console.log(module)

    // Importing logger as object (Usefull if module had multiple functions)
// const logger = require('./logger')  // Set imported module variables as constant to avoid accidental assign
// console.log(logger)
// logger.log('message')
    // Importing logger as function (Usefull if module have only one function)
// const log = require('./logger')  // Set imported module variables as constant to avoid accidental assign
// log('message')

    // Path Module
// const path = require('path')
// var pathObj = path.parse(__filename)
// console.log(pathObj)

    // OS Module
// const os = require('os')
// var totalMemory = os.totalmem()
// var freeMemory = os.freemem()
    // console.log('Total Memory: ' + totalMemory)
    // Below are template string of above expressions
// console.log(`Total Memory: ${totalMemory}`)
// console.log(`Free Memory: ${freeMemory}`)

    // File System Module
// const fs = require('fs')
    // Synchronous
// const files = fs.readdirSync('./')
// console.log(files);
    // Asynchronous
// fs.readdir('./', function(err, files) {
//     if (err)
//         console.log('Error', err)
//     else
//         console.log('Result', files)
// })

    // Event Module
// const EventEmitter = require('events')
// const emitter = new EventEmitter
    // Register a listener
// emitter.on('messageLogged', (arg) => { // '.on' and '.addListener' both are same / 'function' can be written as 'arrow-function(=>)'
//     console.log('Listener called', arg)
// }) 
    // Raise an event
// emitter.emit('messageLogged')
    // Raise an event passing data about that event
// emitter.emit('messageLogged', {id: 1, url: 'http://hi'})

    // Raise a logging event passing user data using Event Module
// const EventEmitter = require('events')
// const emitter = new EventEmitter
// emitter.on('loggingdata', (args) => {
//     console.log('Do some tasks on data', args)
// })
// emitter.emit('loggingdata', {id: 1, name: 'sahil', email:'example@gmil.com', dob: '19-10-2002', sex: 'male'})

    // Class
// const EventEmitter = require('events')
// const Logger = require('./logger')
// const logger = new Logger()
    // Register a Listener
// logger.on('messageLogged', (args) => {
//     console.log('Listener called', args)
// })
// logger.log('message')

    // HTTP Module (low level)
// const http = require('http')
// const server = http.createServer()
// server.on('connection', (socket) => {
//     console.log('New connection...')
// })
// server.listen(3000)
// console.log('Listening to port 3000...')

    // HTTP Module (high level)
const http = require('http')
    // Buiding server
const server = http.createServer((req, res) => {
    if (req.url === '/') {
        res.write('Hello World')
        res.end()
    }
    if (req.url === '/api/courses') {
        res.write(JSON.stringify([1, 2, 3])) // Return from database objects
        res.end()
    }
})
server.listen(3000)
console.log('Listening to port 3000...')
