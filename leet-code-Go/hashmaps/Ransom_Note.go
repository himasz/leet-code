package hashmaps

type RansomNote struct{}

func CanConstruct(ransomNote string, magazine string) bool {
	cnt := [26]int{}
	for _, c := range magazine {
		cnt[c-'a']++
	}
	for _, c := range ransomNote {
		cnt[c-'a']--
		if cnt[c-'a'] < 0 {
			return false
		}
	}
	return true
}

func CanConstructMap(ransomNote string, magazine string) bool {
	cnt := make(map[rune]int)
	for _, c := range magazine {
		cnt[c]++
	}
	for _, c := range ransomNote {
		cnt[c]--
		if cnt[c] < 0 {
			return false
		}
	}
	return true
}
