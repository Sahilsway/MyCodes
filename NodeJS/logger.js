
// var url = 'http://mylogger.in.log'
// function log(message) {
//     // Send http request
//     console.log(message)
// }
// // Exporting logger as object (Usefull if a module have multiple functions)
// // module.exports.log = log

// // Exporting logger as function (Usefull if module have only one function)
// module.exports = log

const EventEmitter = require('events')
class Logger extends EventEmitter {
    log(message) {
        // Send a HTTP request
        console.log(message)
        // Raise an event
        this.emit('messageLogged', {id: 1, url: 'http://nothing'})
    }
}

module.exports = Logger
