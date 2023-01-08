let fName = prompt("Name of a fruit?")  // prompt function doesn't run in vsCode, run in browser as code snippet

switch (fName) {
    case 'apple': {
        console.log('Apple is red in color')
        break;
    }
    case 'banana': {
        console.log('Banana is yellow in color')
        break;
    }
    case 'guava': {
        console.log('Guava is Green in color')
        break;
    }
    case 'orange': {
        console.log('Orange is orange in color')
        break;
    }
    default : {
        console.log("This is fruit is unknown to me")
    }
}

console.log('This is', (fName=='apple' || fName=='banana' || fName=='guava' || fName=='onratechange')? 'a fruit' :'not a fruit')
