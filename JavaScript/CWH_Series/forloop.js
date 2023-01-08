
let marks = {
    math: 40,
    phy: 50,
    chem: 80,
    bio: 90
}

// 'for' loop
for(let key = 0; key < Object.keys(marks).length; key++) {
    console.log(`Mark of ${Object.keys(marks)[key]} = ${marks[Object.keys(marks)[key]]}`)
}

// for...in (Return 'keys' or 'index' of each element)
console.log('\n___for...in Loop___') //-----
for (let key in marks) {
    console.log(`Mark of ${key} is ${marks[key]}`)
}

// for...of (Short form of for loop) (works on iterable variables/object is not iterable)
console.log('\n___for...of Loop___') //-----
let name = 'sahil'
for (let a of name) {
    console.log(`Laters in ${name} are ${a}`)
}

// forEach loop
console.log('\n___forEach Loop___') //-----
const num = [1, 2, 3, 4, 5]
num.forEach((element) => {
    console.log(element)
})

// .map (Unlike 'forEach' which performs on existing array elements 'map' creates a new array of existing array and perform on array elements of new array)
console.log('\n___map function___') //-----
const arr1 = [23, 34, 45, 55]
const arrm = arr1.map((value, index, array) => {
    console.log(value, index, array)
    return value + index
})
console.log(arrm)

// .filter (Returns array elements that passes the test)
console.log('\n___filter function___') //-----
const arrf = arr1.filter((value) => {
    return value < 40
})
console.log(arrf)

// .reduce (Works on all elements)
console.log('\n___reduce function___') //-----
const arrr = arr1.reduce((value1, value2) => {
    return value1 + value2
})
console.log(arrr)

