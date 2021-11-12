const fs = require("fs")

// if it finds a demo in the directory, url encode and append link to visualizer.

dirs1 = fs.readdirSync("./").filter(d => d.includes("-"))
dirs1.forEach((dir) => {
	dirs2 = fs.readdirSync(`./${dir}/`)
	dirs2.forEach((dir1) => {
		if (fs.existsSync(`./${dir}/${dir1}/Demo.java`)) {
			fileContents = fs.readFileSync(`./${dir}/${dir1}/Demo.java`)
			a = encodeURIComponent(fileContents)
			console.log("https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=" + a)
		}
	})
})