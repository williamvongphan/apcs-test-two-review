const fs = require("fs");

for (x = 0; x < 25; x++) {
	fs.writeFileSync(`./explanations/${x}.md`, `# Question ${x}
## Question
* a)
* b)
* c)
* d)
* e)
## Answer
`)
}