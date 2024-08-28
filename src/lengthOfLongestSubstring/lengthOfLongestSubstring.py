class Solution(object):
  def lengthOfLongestSubstring(self, s):

    n = len(s)
    # Current longest substring with unique characters, calculated by referencing an occurrence of the right pointer to the dictionary
    ans = 0

    # i is the left pointer
    i = 0
    # Dictionary to keep track of the indexes of the most recent occurence of a letter in the string
    mp = {}

    # j is the right pointer
    for j in range(n):
      
      # If we've seen this character before, we update the left pointer, therefore minimizing the valid window
      if s[j] in mp:
        i = max(mp[s[j]], i)
        
      # Checking if the current length of the valid substring is longer than our previous value  
      ans =  max(ans, j - i + 1) 
      # Update the right pointer's character's position in the dictionary 
      mp[s[j]] = j + 1 

    return ans