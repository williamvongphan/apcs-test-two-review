const fs = require("fs");

for (x = 1; x < 10; x++) {
	fs.appendFileSync("./readme.md", `${x}. [Question ${x}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/${x})`)
}