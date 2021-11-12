const fs = require("fs");

total = 0;

dir1 = fs.readdirSync("./")
files1 = dir1.filter(f => f.includes(".") && f != ".git");
files1.forEach((file) => {
	a = fs.readFileSync("./" + file, {encoding: "utf8"})
	total += a.split("\n").length;
})

dir2 = fs.readdirSync("./explanations")
files2 = dir2.filter(f => f.includes("."));
files2.forEach((file) => {
	a = fs.readFileSync("./explanations/" + file, {encoding: "utf8"})
	total += a.split("\n").length;
})

dir3 = fs.readdirSync("./explanations/the_part_with_multiple_guesses")
files3 = dir3.filter(f => f.includes("."));
folders3 = dir3.filter(f => f.includes(".") == false);
files3.forEach((file) => {
	a = fs.readFileSync("./explanations/the_part_with_multiple_guesses/" + file, {encoding: "utf8"})
	total += a.split("\n").length;
})

folders3.forEach((folder) => {
	dirs4 = fs.readdirSync("./explanations/the_part_with_multiple_guesses/" + folder)
	files4 = dirs4.filter(f => f.includes("."));
	folders4 = dirs4.filter(f => f.includes(".") == false);
	files4.forEach((file) => {
		a = fs.readFileSync("./explanations/the_part_with_multiple_guesses/" + folder + "/" + file, {encoding: "utf8"})
		total += a.split("\n").length;
	})
	folders4.forEach((folder2) => {
		files5 = fs.readdirSync("./explanations/the_part_with_multiple_guesses/" + folder + "/" + folder2)
		files5.forEach((file) => {
			a = fs.readFileSync("./explanations/the_part_with_multiple_guesses/" + folder + "/" + folder2 + "/" + file, {encoding: "utf8"})
			total += a.split("\n").length;
		})
	})
})

console.log(total + " lines counted!")