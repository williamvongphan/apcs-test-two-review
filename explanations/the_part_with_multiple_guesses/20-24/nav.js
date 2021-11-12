const fs = require("fs");

for (x = 20; x < 25; x++) {
	if (x != 20) {
		fs.appendFileSync(`./${x}/readme.md`, `\n[Question ${x-1}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/${x-1})\n`)
	}
	if (x != 24) {
		fs.appendFileSync(`./${x}/readme.md`, `\n[Question ${x+1}](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/${x+1})`)
	}
}