import * as fs from 'fs'
import readline from 'node:readline'

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question('What do you think of Node.js? ', (answer) => {
    // TODO: Log the answer in a database
    console.log(`Thank you for your valuable feedback: ${answer}`)
    rl.close()

    fs.writeFile('a.txt', answer, err => {
        if (err) console.log('error occurred')
    })
})
