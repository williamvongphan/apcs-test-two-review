const fs = require("fs");

for (x = 1; x < 10; x++) {
	if (x != 1) {
		fs.appendFileSync(`./${x}/readme.md`, `[Question ${x+1}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/${x-1})`)
	}
	if (x != 9) {
		fs.appendFileSync(`./${x}/readme.md`, `[Question ${x+1}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/${x+1})`)
	}
}