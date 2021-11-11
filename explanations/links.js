const fs = require("fs");

for (x = 20; x < 25; x++) {
	fs.appendFileSync("./readme.md", `${x}. [Question ${x}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/${x})  \n`)
}