// String is immutable


// Both are same ('') or ("")
const fname = "Sahil"
console.log(fname)
const sname = 'Swargiary'
console.log(sname)

// String literals (Use of backtick)
const fullname = `Full name: ${fname} ${sname}`
console.log(fullname)

// Escape sequence character (\')
const message = 'What\'s your name?'
console.log(message)

// typeof OPERATOR
console.log(typeof fullname)

// Length PROPERTY
console.log(sname.length)

// 'toUpperCase'/tpLowerCase' function
console.log(fname.toLocaleUpperCase())
console.log(sname.toLowerCase())

// Slice string
console.log(sname.slice(0, 4))
console.log(sname.slice(4))

// Replace string
console.log(sname.replace("gia", ""))

// Concat string (Concatenate strings)
console.log(fname.concat('\'s surname is ', sname))

// Trim string (Remove blank spaces)
console.log(`     ${fname}`)
console.log(`     ${fname}`.trim())

// include function
console.log(`Surname "${sname}" ${fullname.includes(sname)? 'is' : 'is not'} ${fname}'s surname`)

// startsWith() and endsWith() functions

