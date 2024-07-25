package main

import (
	"fmt"
	"leet-code-go/hashmaps"
)

func main() {
	// Variables for the ransom note and magazine
	ransomNote := "hello"
	magazine := "helloworld"

	// Call the canConstruct function
	result := hashmaps.CanConstructMap(ransomNote, magazine)

	// Print the result
	fmt.Printf("Can construct \"%s\" from \"%s\": %t\n", ransomNote, magazine, result)
}
