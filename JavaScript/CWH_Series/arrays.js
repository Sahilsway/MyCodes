
const marks_of_student1 = ['Raaj', 9, 67, 98, 88, null]
console.log(marks_of_student1)
marks_of_student1[5] = 56
console.log('\n___Printing updated array elements___') //-----
for(let i = 0; i < marks_of_student1.length; i++) {
    console.log(marks_of_student1[i])
}
console.log('\n___Printing array length___') //-----
console.log("The length of marks_of_student1 array is", marks_of_student1.length)

    // Array methods
// .join
console.log('\n___Joining array elements using \'_\'___') //-----
console.log(marks_of_student1.join('_'))

// .pop (Remove last element from array)
console.log('\n___Removing last element from the array___') //-----
marks_of_student1.pop()
console.log(marks_of_student1)

// .push (Add element in the last index of the array)
console.log('\n___Adding last element to the array___') //-----
marks_of_student1.push(65)
console.log(marks_of_student1)

// .shift (Remove first element from array)
console.log('\n___Removing first element from the array___') //-----
marks_of_student1.shift()
console.log(marks_of_student1)

// .push (Add element in the beginning of the array)
console.log('\n___Adding first element to the array___') //-----
marks_of_student1.unshift('Deepika')
console.log(marks_of_student1)

// delete OPERATOR (Deletes element of the specified index)     **'delete' operator delete elements without effecting array length**
console.log('\n___Deleting element of index \'3\' from the array___') //-----
delete marks_of_student1[3]
console.log(marks_of_student1)

// .concat (Concatenate multiple arrays in a single array)
console.log('\n___Concatenating array_1 with array_2___') //-----
const marks_of_student2 = ['Karan', 9, 79, 89, 94, 86]
console.log(marks_of_student1.concat(marks_of_student2))

// .sort (Sort array elements in alphabetical order)
console.log('\n___Sorting array_2 elements in alphabetical order___') //-----
console.log(marks_of_student2.sort())

// Sorting in acending and decending order using .sort
console.log('\n___Sorting array_2 in both acending and decending order___') //-----
const acend = (a, b) => {
    return a - b
}
const decend = (a, b) => {
    return b - a
}
console.log(marks_of_student2.sort(acend))
console.log(marks_of_student2.sort(decend))

// .reverse (Reverse array elements in order)
console.log('\n___Reverse array element order___') //-----
marks_of_student2.reverse()
console.log(marks_of_student2)

// .splice (Insert elements in the array __ perameters-- (start: number, deletecount?: number, addnumbers: num1,num2,numN))
console.log('\n___Delete first two marks and add new marks___') //-----
marks_of_student2.splice(1, 2, 98, 96)
console.log(marks_of_student2)

// .slice (Already in sting.js file)

// Array.from (Create an array form any other objects)
console.log('\n___Array.from function___') //-----
const name = 'Sahil'
const nanmearr = Array.from(name)
console.log(nanmearr)

// .push (Push new element to the array)
const num = prompt("Enter a number")
marks_of_student2.push(num)
console.log(marks_of_student2)
