const fs = require("fs");

for (x = 10; x < 20; x++) {
	fs.appendFileSync("./readme.md", `${x}. [Question ${x}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/${x})  \n`)
}