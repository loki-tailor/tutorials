const fs = require('fs')

fs.readdir('cypress', (err, files) => {
    console.log(files.length)
})
