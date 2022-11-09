
let myLeads = []

const inputEl = document.querySelector("#input-el")
const inputBtn = document.querySelector("#input-btn")
const tabBtn = document.querySelector("#tab-btn")
const deleteBtn = document.querySelector("#delete-btn")
let outputEl = document.querySelector("#output-el")

const leadsFromLocalStorage = JSON.parse(localStorage.getItem("myLeads"))

if(leadsFromLocalStorage) {
    myLeads =leadsFromLocalStorage
    render(myLeads)
}

function render(leads) {
    let listItems = ""
    for (let i = 0; i < leads.length; i++) {
        /* Psudo Code-
            create element
            set text content
            append to ul */
        // const li = document.createElement("li")
        // li.textContent = leads[i]
        // outputEl.append(li)

        // listItems += "<li><a target='_blank' href=' " + leads[i] + "'>" + leads[i] + "</a></li>"
        // Above line can be rewrite using #template_string as below
        listItems += `
            <li>
                <a target='_blank' href='${leads[i]}'>
                    ${leads[i]}
                </a>
            </li>
        `
    }
    outputEl.innerHTML = listItems
}

// localStorage.setItem("myLeads", "example/site")
console.log(localStorage.getItem("myLeads"))
localStorage.clear()

inputBtn.addEventListener("click", function() {
    myLeads.push(inputEl.value)
    inputEl.value = ""

    localStorage.setItem("myLeads", JSON.stringify(myLeads))
    render(myLeads)
    
    // Verification
    console.log(localStorage.getItem(myLeads))
})

tabBtn.addEventListener("click", function() {
    chrome.tabs.query({active: true, currentWindow: true}, function(tab) {
        myLeads.push(tab[0].url)
        localStorage.setItem("myLeads", JSON.stringify(myLeads))
        render(myLeads)
    })
})

deleteBtn.addEventListener("dblclick", function() {
    localStorage.clear()
    myLeads = []
    render(myLeads)
})

