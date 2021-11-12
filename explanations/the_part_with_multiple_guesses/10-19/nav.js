const fs = require("fs");

for (x = 10; x < 20; x++) {
	if (x != 1) {
		fs.appendFileSync(`./${x}/readme.md`, `[Question ${x-1}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/${x-1})`)
	}
	if (x != 9) {
		fs.appendFileSync(`./${x}/readme.md`, `[Question ${x+1}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/${x+1})`)
	}
}