class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        counter_s = Counter(s)
        counter_t = Counter(t)
        """
        for i in s:
            if i not in counter_s:
                counter_s[i] = 1
            else:
                counter_s[i] += 1
        for j in t:
            if j not in counter_t:
                counter_t[j] = 1
            else:
                print(counter_t)
                counter_t[j] += 1
                """
        for key in counter_s.keys():
            if key not in counter_t or counter_s[key] != counter_t[key]:
                return False
        return True
