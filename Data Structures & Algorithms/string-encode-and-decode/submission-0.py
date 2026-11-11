class Solution:

    def encode(self, strs: List[str]) -> str:
        encStr = ""
        for word in strs:
            encStr += str(len(word))+"#"+word
        print(encStr)
        return encStr

    def decode(self, s: str) -> List[str]:
        i = 0
        s_len = ''
        w_len = 0
        sol = list()
        while(i < len(s)):
            if(s[i]!='#'):
                s_len += s[i]
                i += 1
            else:
                w_len = int(s_len)
                word = s[i+1:i+1+w_len:]
                sol.append(word)
                i += w_len+1
                s_len = ''
        return sol

